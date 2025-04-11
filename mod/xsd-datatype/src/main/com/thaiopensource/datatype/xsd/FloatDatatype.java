package com.thaiopensource.datatype.xsd;

import org.relaxng.datatype.ValidationContext;

class FloatDatatype extends DoubleDatatype {

  Object getValue(String str, ValidationContext vc) {
    switch (str) {
      case "INF":
        return Float.POSITIVE_INFINITY;
      case "-INF":
        return Float.NEGATIVE_INFINITY;
      case "NaN":
        return Float.NaN;
    }
    return new Float(str);
  }

  public boolean isLessThan(Object obj1, Object obj2) {
    return (Float)obj1 < (Float)obj2;
  }

  public boolean sameValue(Object value1, Object value2) {
    float f1 = (Float)value1;
    float f2 = (Float)value2;
    // NaN = NaN
    return f1 == f2 || (f1 != f1 && f2 != f2);
  }
}
