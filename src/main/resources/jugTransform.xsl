<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="jugTransform.xsl" type="text/xsl"?>
<xsl:stylesheet
        version="2.0"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
    <xsl:template match="*">
        <xsl:element name="NewJug">
        <xsl:attribute name="SomeAttr">SomeValue</xsl:attribute>
        <xsl:attribute name="Somebody"><xsl:value-of select="/JUG/Victim"/></xsl:attribute>
            <xsl:for-each select="/JUG/Count">
                <xsl:element name="NewLine">
                    <!-- TODO Pax count -->
                    <xsl:element name="Name"><xsl:value-of select="Name" /></xsl:element>
                    <xsl:element name="Topic"><xsl:value-of select="Topic" /></xsl:element>
                    <xsl:element name="Number"><xsl:value-of select="Number" /></xsl:element>
                </xsl:element>
            </xsl:for-each>
        </xsl:element>
    </xsl:template>
</xsl:stylesheet>
