package com.thaiopensource.validate.picl;

import com.thaiopensource.util.PropertyMap;
import com.thaiopensource.validate.AbstractSchema;
import com.thaiopensource.validate.Validator;

class SchemaImpl extends AbstractSchema {
  private final Constraint constraint;

  SchemaImpl(PropertyMap properties, Constraint constraint) {
    super(properties);
    this.constraint = constraint;
  }

  public Validator createValidator(PropertyMap properties) {
    return new ValidatorImpl(constraint, properties);
  }

}
