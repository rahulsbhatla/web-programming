<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'" />
<xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />
<xsl:template match="/">

<html>
 <head>
 <title> books </title></head>
 <body>
 <table border="1" bgcolor="#4D1E04 " >
 <tr style="color:#D9D9D9 "><th>Title</th>
 <th> Author </th>
 <th> Genre </th>
 <th> Copyright </th>
 <th> Edition </th>
 <th> ISBN </th>
 <th> Publisher</th>
 <th> Price</th>
 </tr>
<xsl:for-each select="/books/book">
<tr>
<td bgcolor="#BA55D3"><xsl:value-of select="title"/></td>
<td bgcolor="#0000AO" ><b><xsl:value-of select="author"/></b></td>
<td bgcolor="#8273BA" ><xsl:value-of select="genre"/></td>
<td bgcolor="#ADD8EF"><xsl:value-of select="copyright"/></td>
<td bgcolor="#90EE90"><xsl:value-of select="edition" /></td>
<td bgcolor="#FFFF66"><xsl:value-of select="isbn" /></td>
<td bgcolor="#FFB266"><xsl:value-of select="publisher"/></td>
<td bgcolor="#CD5C5C"><xsl:value-of select="price" /></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet> 