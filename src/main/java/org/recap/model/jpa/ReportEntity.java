package org.recap.model.jpa;


import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peris on 8/10/16.
 */
@Entity
@Table(name = "REPORT_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "RECORD_NUM"))
@Data
@EqualsAndHashCode(callSuper=false)
public class ReportEntity extends AbstractEntity<Integer> {

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
    private List<ReportDataEntity> reportDataEntities = new ArrayList<>();


    /**
     * Add all.
     *
     * @param reportDataEntities the report data entities
     */
    public void addAll(List<ReportDataEntity> reportDataEntities) {
        if(null == getReportDataEntities()){
            reportDataEntities = new ArrayList<>();
        }
        this.reportDataEntities.addAll(reportDataEntities);
    }
}
