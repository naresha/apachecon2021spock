package com.nareshak.demo

import spock.lang.Specification

class TalkPopularityServiceSpec extends Specification {
    private AudienceCountService audienceCountService = Mock()
    private TalkPopularityService talkPopularityService =
            new TalkPopularityService(audienceCountService)

    void "when audience count is 200 talk should be considered popular"() {
        given:
        String talk = "Whats new in Groovy 4"
        when:
        boolean isPopular = talkPopularityService.isPopularTalk(talk)
        then:
        isPopular == true
        and:
        1 * audienceCountService.getAudienceCount(talk) >> 200
    }

    void "when audience count is 90 talk should be considered not popular"() {
        given:
        String talk = "Some talk"
        when:
        boolean isPopular = talkPopularityService.isPopularTalk(talk)
        then:
        isPopular == false
        and:
        1 * audienceCountService.getAudienceCount(talk) >> 90
    }
}
