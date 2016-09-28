package de.digitalcollections.iiif.presentation.model.impl.jackson.mixin.v2_0_0.references;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class IiifReferenceMixin {
  @JsonProperty("@id")
  abstract String getId();

  @JsonProperty("@type")
  abstract String getType();
}
