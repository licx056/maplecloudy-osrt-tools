// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.maplecloudy.osrt.model.maven;

/**
 * Describes where an artifact has moved to. If any of the values
 * are omitted, it is
 *         assumed to be the same as it was before.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Relocation
    implements java.io.Serializable, Cloneable, InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The group ID the artifact has moved to.
     */
    private String groupId;

    /**
     * The new artifact ID of the artifact.
     */
    private String artifactId;

    /**
     * The new version of the artifact.
     */
    private String version;

    /**
     * An additional message to show the user about the move, such
     * as the reason.
     */
    private String message;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     *
     * @return Relocation
     */
    public Relocation clone()
    {
        try
        {
            Relocation copy = (Relocation) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( Exception ex )
        {
            throw (RuntimeException) new UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- Relocation clone()

    /**
     * Get the new artifact ID of the artifact.
     * 
     * @return String
     */
    public String getArtifactId()
    {
        return this.artifactId;
    } //-- String getArtifactId()

    /**
     * Get the group ID the artifact has moved to.
     * 
     * @return String
     */
    public String getGroupId()
    {
        return this.groupId;
    } //-- String getGroupId()

    /**
     * 
     * 
     * @param key
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getLocation( Object )

    /**
     * Get an additional message to show the user about the move,
     * such as the reason.
     * 
     * @return String
     */
    public String getMessage()
    {
        return this.message;
    } //-- String getMessage()

    /**
     * Get the new version of the artifact.
     * 
     * @return String
     */
    public String getVersion()
    {
        return this.version;
    } //-- String getVersion()

    /**
     * Set the new artifact ID of the artifact.
     * 
     * @param artifactId
     */
    public void setArtifactId( String artifactId )
    {
        this.artifactId = artifactId;
    } //-- void setArtifactId( String )

    /**
     * Set the group ID the artifact has moved to.
     * 
     * @param groupId
     */
    public void setGroupId( String groupId )
    {
        this.groupId = groupId;
    } //-- void setGroupId( String )

    /**
     * 
     * 
     * @param key
     * @param location
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * Set an additional message to show the user about the move,
     * such as the reason.
     * 
     * @param message
     */
    public void setMessage( String message )
    {
        this.message = message;
    } //-- void setMessage( String )

    /**
     * Set the new version of the artifact.
     * 
     * @param version
     */
    public void setVersion( String version )
    {
        this.version = version;
    } //-- void setVersion( String )

}
