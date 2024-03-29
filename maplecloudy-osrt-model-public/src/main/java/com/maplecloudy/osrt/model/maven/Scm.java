// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.maplecloudy.osrt.model.maven;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The <code>&lt;scm&gt;</code> element contains
 * informations required to the SCM
 * (Source Control Management) of the project.
 *
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Scm
    implements java.io.Serializable, Cloneable, InputLocationTracker {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * The source control management system URL
   * that describes the repository and how to connect
   * to the
   * repository. For more information, see the
   * <a
   * href="https://maven.apache.org/scm/scm-url-format.html">URL
   * format</a>
   * and <a
   * href="https://maven.apache.org/scm/scms-overview.html">list
   * of supported SCMs</a>.
   * This connection is read-only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property)
   * <p>
   * .
   */
  private String connection;

  /**
   * Just like <code>connection</code>, but for
   * developers, i.e. this scm connection
   * will not be read only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property)
   * <p>
   * .
   */
  private String developerConnection;

  /**
   * The tag of current code. By default, it's set to HEAD during
   * development.
   */
  private String tag = "HEAD";

  /**
   * The URL to the project's browsable SCM
   * repository, such as ViewVC or Fisheye.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property), or just parent
   * value if
   *
   * <code>child.urls.inherit.append.path="false"</code>
   */
  private String url;

  /**
   * When childs inherit from urls, append path or
   * not?. Note: While the type
   * of this field is <code>String</code> for
   * technical reasons, the semantic type is actually
   * <code>Boolean</code>
   * <br /><b>Default value is</b>: <code>true</code>
   */
  private String childInheritAppendPath;

  /**
   * Field locations.
   */
  private java.util.Map<Object,InputLocation> locations;

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method clone.
   *
   * @return Scm
   */
  public Scm clone() {
    try {
      Scm copy = (Scm) super.clone();

      if (copy.locations != null) {
        copy.locations = new java.util.LinkedHashMap(copy.locations);
      }

      return copy;
    } catch (Exception ex) {
      throw (RuntimeException) new UnsupportedOperationException(
          getClass().getName() + " does not support clone()").initCause(ex);
    }
  } //-- Scm clone()

  /**
   * Get when childs inherit from urls, append path or not?.
   * Note: While the type
   * of this field is <code>String</code> for
   * technical reasons, the semantic type is actually
   * <code>Boolean</code>
   * <br /><b>Default value is</b>: <code>true</code>
   *
   * @return String
   */
  public String getChildInheritAppendPath() {
    return this.childInheritAppendPath;
  } //-- String getChildInheritAppendPath()

  /**
   * Get the source control management system URL
   * that describes the repository and how to connect
   * to the
   * repository. For more information, see the
   * <a
   * href="https://maven.apache.org/scm/scm-url-format.html">URL
   * format</a>
   * and <a
   * href="https://maven.apache.org/scm/scms-overview.html">list
   * of supported SCMs</a>.
   * This connection is read-only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property).
   *
   * @return String
   */
  public String getConnection() {
    return this.connection;
  } //-- String getConnection()

  /**
   * Get just like <code>connection</code>, but for developers,
   * i.e. this scm connection
   * will not be read only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property).
   *
   * @return String
   */
  public String getDeveloperConnection() {
    return this.developerConnection;
  } //-- String getDeveloperConnection()

  /**
   * @param key
   * @return InputLocation
   */
  public InputLocation getLocation(Object key) {
    return (locations != null) ? locations.get(key) : null;
  } //-- InputLocation getLocation( Object )

  /**
   * Get the tag of current code. By default, it's set to HEAD
   * during development.
   *
   * @return String
   */
  public String getTag() {
    return this.tag;
  } //-- String getTag()

  /**
   * Get the URL to the project's browsable SCM repository, such
   * as ViewVC or Fisheye.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property), or just parent
   * value if
   *
   * <code>child.urls.inherit.append.path="false"</code>
   *
   * @return String
   */
  public String getUrl() {
    return this.url;
  } //-- String getUrl()

  /**
   * Set when childs inherit from urls, append path or not?.
   * Note: While the type
   * of this field is <code>String</code> for
   * technical reasons, the semantic type is actually
   * <code>Boolean</code>
   * <br /><b>Default value is</b>: <code>true</code>
   *
   * @param childInheritAppendPath
   */
  public void setChildInheritAppendPath(String childInheritAppendPath) {
    this.childInheritAppendPath = childInheritAppendPath;
  } //-- void setChildInheritAppendPath( String )

  /**
   * Set the source control management system URL
   * that describes the repository and how to connect
   * to the
   * repository. For more information, see the
   * <a
   * href="https://maven.apache.org/scm/scm-url-format.html">URL
   * format</a>
   * and <a
   * href="https://maven.apache.org/scm/scms-overview.html">list
   * of supported SCMs</a>.
   * This connection is read-only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property).
   *
   * @param connection
   */
  public void setConnection(String connection) {
    this.connection = connection;
  } //-- void setConnection( String )

  /**
   * Set just like <code>connection</code>, but for developers,
   * i.e. this scm connection
   * will not be read only.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property).
   *
   * @param developerConnection
   */
  public void setDeveloperConnection(String developerConnection) {
    this.developerConnection = developerConnection;
  } //-- void setDeveloperConnection( String )

  /**
   * @param key
   * @param location
   */
  public void setLocation(Object key, InputLocation location) {
    if (location != null) {
      if (this.locations == null) {
        this.locations = new java.util.LinkedHashMap<Object,InputLocation>();
      }
      this.locations.put(key, location);
    }
  } //-- void setLocation( Object, InputLocation )

  /**
   * Set the tag of current code. By default, it's set to HEAD
   * during development.
   *
   * @param tag
   */
  public void setTag(String tag) {
    this.tag = tag;
  } //-- void setTag( String )

  /**
   * Set the URL to the project's browsable SCM repository, such
   * as ViewVC or Fisheye.
   * <br><b>Default value is</b>: parent value [+
   * path adjustment] + (artifactId or
   * <code>project.directory</code> property), or just parent
   * value if
   *
   * <code>child.urls.inherit.append.path="false"</code>
   *
   * @param url
   */
  public void setUrl(String url) {
    this.url = url;
  } //-- void setUrl( String )

  public boolean isChildInheritAppendPath() {
    return (childInheritAppendPath != null) ?
        Boolean.parseBoolean(childInheritAppendPath) :
        true;
  }

  public void setChildInheritAppendPath(boolean childInheritAppendPath) {
    this.childInheritAppendPath = String.valueOf(childInheritAppendPath);
  }

}
