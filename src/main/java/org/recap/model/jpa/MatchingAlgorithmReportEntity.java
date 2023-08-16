package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rmaheswaran on 12/08/21.
 */
@Entity
@Table(name = "MA_REPORT_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "RECORD_NUM"))
@Data
@EqualsAndHashCode(callSuper=false)
public class MatchingAlgorithmReportEntity extends AbstractEntity<Integer> {

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "TYPE")
    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORD_NUM")
    private List<MatchingAlgorithmReportDataEntity> reportDataEntities = new ArrayList<>();


    /**
     * Add all.
     *
     * @param reportDataEntities the report data entities
     */
    public void addAll(List<MatchingAlgorithmReportDataEntity> reportDataEntities) {
        if(null == getReportDataEntities()){
            reportDataEntities = new ArrayList<>();
        }
        this.reportDataEntities.addAll(reportDataEntities);
    }
}
