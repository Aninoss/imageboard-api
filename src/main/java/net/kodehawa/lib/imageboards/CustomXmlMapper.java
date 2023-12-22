package net.kodehawa.lib.imageboards;

import com.ctc.wstx.api.WstxInputProperties;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.text.StringEscapeUtils;

import javax.xml.stream.XMLResolver;

public class CustomXmlMapper extends XmlMapper {

    public CustomXmlMapper() {
        super();
        getFactory().getXMLInputFactory().setProperty(
                WstxInputProperties.P_UNDECLARED_ENTITY_RESOLVER,
                (XMLResolver) (publicId, systemId, baseUri, ns) -> StringEscapeUtils.unescapeHtml4("&" + ns + ";")
        );
    }

}
