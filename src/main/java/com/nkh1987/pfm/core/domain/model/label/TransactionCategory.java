package com.nkh1987.pfm.core.domain.model.label;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TransactionCategory {

    public static final List<String> categories = Collections.unmodifiableList(Arrays.asList(
            "Transportation", "membership", "nutrition", "entertainment"
    ));
}
