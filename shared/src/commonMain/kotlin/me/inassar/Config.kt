package me.inassar

import me.inassar.common.config.Platform
import org.koin.core.module.Module

expect fun getPlatformName(): Platform
expect fun platformNetworkEngineModule(): Module