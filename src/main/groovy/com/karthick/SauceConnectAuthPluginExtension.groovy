package com.karthick

import org.gradle.api.tasks.Internal

class SauceConnectAuthPluginExtension {
    @Internal  def String username = "$System.env.SAUCE_USERNAME"
    @Internal  def String key = "$System.env.SAUCE_ACCESS_KEY"
    @Internal String options =""
}
