package com.hs.gpxparser;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.hs.gpxparser.extension.IExtensionParser;

class BaseGPX {
	protected static final SimpleDateFormat xmlDateFormatDefault = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	protected static final ArrayList<SimpleDateFormat> xmlDateFormatList;
	static {
		xmlDateFormatList = new ArrayList<SimpleDateFormat>();
		xmlDateFormatList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"));
		xmlDateFormatList.add(new SimpleDateFormat("yyyy-MM-dd\'T\'kk:mm:ss.S\'Z\'"));
		xmlDateFormatList.add(new SimpleDateFormat("yyyy-MM-dd\'T\'kk:mm:ss.SS\'Z\'"));
		xmlDateFormatList.add(new SimpleDateFormat("yyyy-MM-dd\'T\'kk:mm:ss.SSS\'Z\'"));
	}

	protected final ArrayList<IExtensionParser> extensionParsers = new ArrayList<IExtensionParser>();

	/**
	 * Adds a new extension parser to be used when parsing a gpx steam
	 *
	 * @param parser
	 *            an instance of a {@link IExtensionParser} implementation
	 */
	public void addExtensionParser(IExtensionParser parser) {
		this.extensionParsers.add(parser);
	}

	/**
	 * Removes an extension parser previously added
	 *
	 * @param parser
	 *            an instance of a {@link IExtensionParser} implementation
	 */
	public void removeExtensionParser(IExtensionParser parser) {
		this.extensionParsers.remove(parser);
	}
}
