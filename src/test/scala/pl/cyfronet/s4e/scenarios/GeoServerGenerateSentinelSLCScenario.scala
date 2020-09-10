package pl.cyfronet.s4e.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import pl.cyfronet.s4e.chunks.headers.GSHeaders

class GeoServerGenerateSentinelSLCScenario {
  private val scn = scenario("GeoServerGenerateSentinelSLC")
    .exec(http("request_0")
      .get("/assets/images/ico_calendar.svg")
      .headers(GSHeaders.headers_0)
      .resources(http("request_1")
        .get("/api/v1/products/6/scenes/available?timeZone=Europe/Warsaw&yearMonth=2020-01")
        .headers(GSHeaders.headers_1),
        http("request_2")
          .get("/api/v1/products/6/scenes?date=2020-01-21&timeZone=Europe/Warsaw")
          .headers(GSHeaders.headers_1)))
    .pause(1)
    .exec(http("request_3")
      .get("/api/v1/products/6/scenes/available?tz=Europe/Warsaw&yearMonth=2019-12")
      .headers(GSHeaders.headers_1)
      .resources(http("request_4")
        .get("/api/v1/products/6/scenes/available?tz=Europe/Warsaw&yearMonth=2020-01")
        .headers(GSHeaders.headers_1),
        http("request_5")
          .get("/api/v1/products/6/scenes/available?tz=Europe/Warsaw&yearMonth=2020-02")
          .headers(GSHeaders.headers_1)))
    .pause(1)
    .exec(http("request_6")
      .get("/api/v1/products/6/scenes?date=2020-01-14&timeZone=Europe/Warsaw")
      .headers(GSHeaders.headers_1))
    .pause(1)
    .exec(http("GS-1")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-14T04%3A26%3A18Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
      .headers(GSHeaders.headers_7)
      .resources(http("GS-2")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-14T04%3A26%3A18Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
        .headers(GSHeaders.headers_7)))
    .pause(1)
    .exec(http("GS-3")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-14T05%3A11%3A03Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
      .headers(GSHeaders.headers_7)
      .resources(http("GS-4")
        .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-14T16%3A21%3A38Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
        .headers(GSHeaders.headers_7)))
    .pause(1)
    .exec(http("request_11")
      .get("/api/v1/products/6/scenes?date=2020-01-08&timeZone=Europe/Warsaw")
      .headers(GSHeaders.headers_1))
    .pause(1)
    .exec(http("GS-5")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-08T04%3A25%3A37Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
      .headers(GSHeaders.headers_7)
      .resources(http("GS-6")
        .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-08T05%3A16%3A03Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
        .headers(GSHeaders.headers_7),
        http("GS-7")
          .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-08T16%3A18%3A28Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
          .headers(GSHeaders.headers_7)))
    .pause(1)
    .exec(http("request_15")
      .get("/api/v1/products/6/scenes?date=2020-01-26&timeZone=Europe/Warsaw")
      .headers(GSHeaders.headers_1))
    .pause(1)
    .exec(http("GS-8")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-26T04%3A26%3A18Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
      .headers(GSHeaders.headers_7))
    .pause(1)
    .exec(http("GS-9")
      .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-26T05%3A11%3A03Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
      .headers(GSHeaders.headers_7)
      .resources(http("GS-10")
        .get("/wms?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image%2Fpng&TRANSPARENT=true&LAYERS=development%3Asentinel_1_slc&TIME=2020-01-26T16%3A21%3A38Z&CRS=EPSG%3A3857&STYLES=&WIDTH=1454&HEIGHT=1358&BBOX=261720.38484844333%2C5224623.757348367%2C3818182.436901124%2C8546271.258508986")
        .headers(GSHeaders.headers_7)))

  def getScenario = scn
}