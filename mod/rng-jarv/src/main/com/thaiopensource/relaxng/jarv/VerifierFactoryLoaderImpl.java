package com.thaiopensource.relaxng.jarv;

import com.thaiopensource.xml.util.WellKnownNamespaces;
import org.iso_relax.verifier.VerifierFactory;
import org.iso_relax.verifier.VerifierFactoryLoader;

public class VerifierFactoryLoaderImpl implements VerifierFactoryLoader {
  public VerifierFactory createFactory(String schemaLanguage) {
    if (schemaLanguage.equals(WellKnownNamespaces.RELAX_NG)
      || schemaLanguage.equals(WellKnownNamespaces.RELAX_NG_0_9))
      return new VerifierFactoryImpl();
    return null;
  }
}
