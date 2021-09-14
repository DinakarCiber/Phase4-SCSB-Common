package org.recap.model.jaxb;

import org.recap.model.jaxb.marc.ContentType;
import org.recap.model.jaxb.marc.MatchingInstitutionBibIdType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bib implements Serializable {
    @XmlElement(name = "owningInstitutionId")
    private String owningInstitutionId;
    @XmlElement(name = "owningInstitutionBibId")
    private String owningInstitutionBibId;

    @XmlElement(name= "content", required = true, nillable = true)
    protected ContentType content;

    @XmlElement
    protected List<MatchingInstitutionBibIdType> matchingInstitutionBibId;

    @XmlElement(name = "matchingIdentity")
    private String matchingIdentity;
    @XmlElement(name = "matchScore")
    private String matchScore;
    @XmlElement(name = "anamolyFlag")
    private String anamolyFlag;


    /**
     * Gets owning institution bib id.
     *
     * @return the owning institution bib id
     */
    public String getOwningInstitutionBibId() {
        return owningInstitutionBibId;
    }

    /**
     * Sets owning institution bib id.
     *
     * @param owningInstitutionBibId the owning institution bib id
     */
    public void setOwningInstitutionBibId(String owningInstitutionBibId) {
        this.owningInstitutionBibId = owningInstitutionBibId;
    }

    /**
     * Gets owning institution id.
     *
     * @return the owning institution id
     */
    public String getOwningInstitutionId() {
        return owningInstitutionId;
    }

    /**
     * Sets owning institution id.
     *
     * @param owningInstitutionId the owning institution id
     */
    public void setOwningInstitutionId(String owningInstitutionId) {
        this.owningInstitutionId = owningInstitutionId;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(ContentType content) {
        this.content = content;
    }

    public List<MatchingInstitutionBibIdType> getMatchingInstitutionBibId() {
        return matchingInstitutionBibId;
    }

    public void setMatchingInstitutionBibId(List<MatchingInstitutionBibIdType> matchingInstitutionBibId) {
        this.matchingInstitutionBibId = matchingInstitutionBibId;
    }

    /**
     * Gets matching Identity
     *
     * @return the matching Identity
     */
    public String getMatchingIdentity() {
        return matchingIdentity;
    }

    /**
     * Sets matching Identity.
     *
     * @param matchingIdentity the matchingIdentity
     */
    public void setMatchingIdentity(String matchingIdentity) {
        this.matchingIdentity = matchingIdentity;
    }

    /**
     * Gets match Score
     *
     * @return the match Score
     */
    public String getMatchScore() {
        return matchScore;
    }

    /**
     * Sets match Score.
     *
     * @param matchScore
     */
    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    /**
     * Gets anamolyFlag.
     *
     * @return the anamolyFlag
     */
    public String getAnamolyFlag() {
        return anamolyFlag;
    }

    /**
     * Sets anamolyFlag.
     *
     * @param anamolyFlag the content
     */
    public void setAnamolyFlag(String anamolyFlag) {
        this.anamolyFlag = anamolyFlag;
    }

}
