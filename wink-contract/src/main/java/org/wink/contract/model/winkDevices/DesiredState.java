package org.wink.contract.model.winkDevices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DesiredState
{
  private int pairing_mode_duration;
  private Double brightness;
  private Boolean powered;
}