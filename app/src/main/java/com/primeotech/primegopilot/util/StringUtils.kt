package com.daniyalidrees.newapp.utils

/**
 * Created by daniyalidrees on 2019-10-08.
 */

class StringUtils {
    companion object {

        /**
         * Returns default value if the given string is null else the given string is returned
         */
        fun ifNotNullOrBlankElse(value: String?, defaultValue: String): String {
            if (value.isNullOrBlank()) {
                return defaultValue
            } else {
                return value
            }
        }
    }
}