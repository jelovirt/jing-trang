package com.thaiopensource.validate.auto;

import com.thaiopensource.validate.IncorrectSchemaException;
import com.thaiopensource.validate.Schema;
import org.xml.sax.SAXException;

import java.io.IOException;

public interface SchemaFuture {
  Schema getSchema() throws IncorrectSchemaException, SAXException, IOException;

  RuntimeException unwrapException(RuntimeException e) throws SAXException, IOException, IncorrectSchemaException;
}
