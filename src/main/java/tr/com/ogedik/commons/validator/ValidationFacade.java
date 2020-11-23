package tr.com.ogedik.commons.validator;

import tr.com.ogedik.commons.model.BusinessObject;

import java.util.Arrays;

/** @author orkun.gedik */
public abstract class ValidationFacade<T extends BusinessObject> {

  public void validate(T validationRequest, Validator<T>... validators) {
    Arrays.stream(validators).forEach(validator -> validator.validate(validationRequest));
  }
}
