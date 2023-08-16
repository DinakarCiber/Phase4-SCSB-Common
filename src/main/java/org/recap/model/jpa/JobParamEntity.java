package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeshbabuk on 29/6/17.
 */
@Entity
@Table(name = "JOB_PARAM_T")
@AttributeOverride(name = "id", column = @Column(name = "RECORD_NUM"))
@Data
@EqualsAndHashCode(callSuper=false)
public class JobParamEntity extends AbstractEntity<Integer> {

    @Column(name = "JOB_NAME")
    private String jobName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORD_NUM")
    private List<JobParamDataEntity> jobParamDataEntities = new ArrayList<>();

    /**
     * Add all.
     *
     * @param jobParamDataEntities the job param data entities
     */
    public void addAll(List<JobParamDataEntity> jobParamDataEntities) {
        if (null == getJobParamDataEntities()) {
            this.jobParamDataEntities = new ArrayList<>();
        }
        this.jobParamDataEntities.addAll(jobParamDataEntities);
    }
}
