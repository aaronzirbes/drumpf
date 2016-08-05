package com.drumf.merica

import groovy.transform.CompileStatic

@CompileStatic
class ElectionRunner {

    static void main (String ... args) {
        println "Running for Cheif!"
            new Trump().runForPresident()
    }

}
