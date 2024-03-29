// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.maplecloudy.osrt.model.maven;

/**
 * This is an activator which will detect an operating system's
 * attributes in order
 *         to activate its profile.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ActivationOS
    implements java.io.Serializable, Cloneable, InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     *
     *
     *             The name of the operating system to be used to
     * activate the profile. This must be an exact match
     *             of the <code>${os.name}</code> Java property,
     * such as <code>Windows XP</code>.
     *
     *
     */
    private String name;

    /**
     *
     *
     *             The general family of the OS to be used to
     * activate the profile, such as
     *             <code>windows</code> or <code>unix</code>.
     *
     *
     */
    private String family;

    /**
     * The architecture of the operating system to be used to
     * activate the
     *           profile.
     */
    private String arch;

    /**
     * The version of the operating system to be used to activate
     * the
     *           profile.
     */
    private String version;

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
     * @return ActivationOS
     */
    public ActivationOS clone()
    {
        try
        {
            ActivationOS copy = (ActivationOS) super.clone();

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
    } //-- ActivationOS clone()

    /**
     * Get the architecture of the operating system to be used to
     * activate the
     *           profile.
     * 
     * @return String
     */
    public String getArch()
    {
        return this.arch;
    } //-- String getArch()

    /**
     * Get the general family of the OS to be used to activate the
     * profile, such as
     *             <code>windows</code> or <code>unix</code>.
     * 
     * @return String
     */
    public String getFamily()
    {
        return this.family;
    } //-- String getFamily()

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
     * Get the name of the operating system to be used to activate
     * the profile. This must be an exact match
     *             of the <code>${os.name}</code> Java property,
     * such as <code>Windows XP</code>.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the version of the operating system to be used to
     * activate the
     *           profile.
     * 
     * @return String
     */
    public String getVersion()
    {
        return this.version;
    } //-- String getVersion()

    /**
     * Set the architecture of the operating system to be used to
     * activate the
     *           profile.
     * 
     * @param arch
     */
    public void setArch( String arch )
    {
        this.arch = arch;
    } //-- void setArch( String )

    /**
     * Set the general family of the OS to be used to activate the
     * profile, such as
     *             <code>windows</code> or <code>unix</code>.
     * 
     * @param family
     */
    public void setFamily( String family )
    {
        this.family = family;
    } //-- void setFamily( String )

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
     * Set the name of the operating system to be used to activate
     * the profile. This must be an exact match
     *             of the <code>${os.name}</code> Java property,
     * such as <code>Windows XP</code>.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the version of the operating system to be used to
     * activate the
     *           profile.
     * 
     * @param version
     */
    public void setVersion( String version )
    {
        this.version = version;
    } //-- void setVersion( String )

}
