package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by rajeshbabuk on 7/7/17.
 */
@Entity
@Table(name = "JOB_PARAM_DATA_T")
@AttributeOverride(name = "id", column = @Column(name = "JOB_PARAM_DATA_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class JobParamDataEntity extends AbstractEntity<Integer> {

    @Column(name = "PARAM_NAME")
    private String paramName;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Column(name = "RECORD_NUM")
    private String recordNum;

}