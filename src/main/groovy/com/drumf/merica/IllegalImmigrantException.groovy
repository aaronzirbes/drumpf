package com.drumf.merica

import groovy.transform.CompileStatic

@CompileStatic
class IllegalImmigrantException extends Exception {

    IllegalImmigrantException(String name) {
        super(name)
    }

}
