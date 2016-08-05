package com.drumf.merica

import groovy.transform.CompileStatic

@CompileStatic
class Trump extends Drumpf {

    String name = 'Donald'

    void runForPresident() {
        marryWife()
    }

    void marryWife() {
        becomeBigot()
    }

    void becomeBigot() {
        throw new IllegalImmigrantException('self.wife instanceof Immigrant!')
    }

}
