package org.nitri.opentopo.viewmodel

import androidx.lifecycle.ViewModel
import io.ticofab.androidgpxparser.parser.domain.Gpx

class GpxViewModel : ViewModel() {
    var gpx: Gpx? = null
    var gpxUriString: String? = null
    var markerCoordinates: List<List<Double>>? = null // Only marker coordinates
    var orsProfile: String? = null
    var displayState: GpxDisplayState = GpxDisplayState.IDLE

    enum class GpxDisplayState {
        IDLE,
        LOADED_FROM_FILE,
        CALCULATED
    }
}