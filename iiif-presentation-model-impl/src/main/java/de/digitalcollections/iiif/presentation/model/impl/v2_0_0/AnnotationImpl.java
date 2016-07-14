package de.digitalcollections.iiif.presentation.model.impl.v2_0_0;

import de.digitalcollections.iiif.presentation.model.api.v2_0_0.Annotation;
import de.digitalcollections.iiif.presentation.model.api.v2_0_0.Metadata;
import de.digitalcollections.iiif.presentation.model.api.v2_0_0.Thumbnail;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class AnnotationImpl extends AbstractIiifResourceImpl implements Annotation {

  private String description; // optional
  private String label; // optional
  private List<Metadata> metadata; // optional
  private Thumbnail thumbnail; // optional
  private String viewingHint; // optional

  public AnnotationImpl() {
    type = "oa:Annotation";
  }

  /**
   * Convenience constructor (as id and label are optional)
   *
   * @param id unique id of resource
   * @param label label of the Annotation
   */
  public AnnotationImpl(URI id, String label) {
    this();
    this.label = label;
    this.id = id;
  }

  public AnnotationImpl(String id, String label) throws URISyntaxException {
    this(new URI(id), label);
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public List<Metadata> getMetadata() {
    return metadata;
  }

  @Override
  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }

  @Override
  public Thumbnail getThumbnail() {
    return thumbnail;
  }

  @Override
  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public String getViewingHint() {
    return viewingHint;
  }

  @Override
  public void setViewingHint(String viewingHint) {
    this.viewingHint = viewingHint;
  }
}