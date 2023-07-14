package com.nkh1987.pfm.core.domain.model.label;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransactionTag {

    public static final List<String> tags = Collections.unmodifiableList(Arrays.asList(
            "partner", "wedding", "furniture", "nutrition", "bill"
    ));
}
