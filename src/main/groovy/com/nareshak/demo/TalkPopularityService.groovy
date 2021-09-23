package com.nareshak.demo

import groovy.transform.Canonical

@Canonical
class TalkPopularityService {

    AudienceCountService audienceCountService

    public boolean isPopularTalk(String talk) {
        def count = audienceCountService.getAudienceCount(talk)
        count > 100 ? true : false
    }
}
