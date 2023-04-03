package com.irvanudin.uts.utils;

import java.time.ZoneId;
import java.time.format.*;
import java.time.ZonedDateTime;

public class Helpers {
  public static String getDateNow() {
    ZoneId zone = ZoneId.of("UTC+7");
    ZonedDateTime now = ZonedDateTime.now(zone);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return now.format(formatter);
  }
}