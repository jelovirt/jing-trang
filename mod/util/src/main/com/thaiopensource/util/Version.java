package com.thaiopensource.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;

public class Version {
  private Version() {
  }

  public static String getVersion(Class<?> cls) {
    InputStream in = cls.getResourceAsStream("resources/Version.properties");
    if (in != null) {
      Properties props = new Properties();
      try {
        props.load(in);
        String version = props.getProperty("version");
        if (version != null)
          return version;
      } catch (IOException e) {
      }
    }
    throw new MissingResourceException("no version property",
      cls.getName(),
      "version");
  }

}
