package org.recap.model.transfer;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Created by sheiks on 13/07/17.
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ItemSource extends Source {
    private String owningInstitutionItemId;
}
