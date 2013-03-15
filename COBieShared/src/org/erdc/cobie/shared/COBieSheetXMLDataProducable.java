package org.erdc.cobie.shared;

import java.io.File;

import org.erdc.cobie.sheetxmldata.COBIEDocument;

public interface COBieSheetXMLDataProducable
{
    COBIEDocument toCOBieSheetXMLData(File incomingFile) throws Exception;
}
