package com.thaiopensource.datatype;

import com.thaiopensource.datatype.xsd.DatatypeLibraryFactoryImpl;
import org.relaxng.datatype.DatatypeLibrary;
import org.relaxng.datatype.DatatypeLibraryFactory;

// We use this instead of the one in org.relaxng.datatype.helper because tools.jar in Java 6 includes
// org.relaxng.datatype, which messes up class loading for the jing task in Ant, when Ant's class loader's
// parent will have tools.jar in its classpath.
public class DatatypeLibraryLoader implements DatatypeLibraryFactory {
  private final DatatypeLibraryFactoryImpl datatypeLibraryFactory = new DatatypeLibraryFactoryImpl();

  public DatatypeLibrary createDatatypeLibrary(String uri) {
    return datatypeLibraryFactory.createDatatypeLibrary(uri);
  }
}
