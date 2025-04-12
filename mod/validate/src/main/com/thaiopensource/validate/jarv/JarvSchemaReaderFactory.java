package com.thaiopensource.validate.jarv;

import com.thaiopensource.validate.Option;
import com.thaiopensource.validate.SchemaReader;
import com.thaiopensource.validate.SchemaReaderFactory;
import org.iso_relax.verifier.VerifierConfigurationException;
import org.iso_relax.verifier.VerifierFactory;

public class JarvSchemaReaderFactory implements SchemaReaderFactory {
  public SchemaReader createSchemaReader(String namespaceUri) {
    try {
      VerifierFactory vf = VerifierFactory.newInstance(namespaceUri);
      if (vf != null)
        return new VerifierFactorySchemaReader(vf);
    } catch (VerifierConfigurationException e) {
    }
    return null;
  }

  public Option getOption(String uri) {
    return null;
  }
}
