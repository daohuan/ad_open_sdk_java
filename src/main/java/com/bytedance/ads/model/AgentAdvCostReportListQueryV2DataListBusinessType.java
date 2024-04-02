/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(AgentAdvCostReportListQueryV2DataListBusinessType.Adapter.class)
public enum AgentAdvCostReportListQueryV2DataListBusinessType {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_10(10l),
  
  NUMBER_102(102l),
  
  NUMBER_105(105l),
  
  NUMBER_107(107l),
  
  NUMBER_11(11l),
  
  NUMBER_12(12l),
  
  NUMBER_127(127l),
  
  NUMBER_13(13l),
  
  NUMBER_138(138l),
  
  NUMBER_14(14l),
  
  NUMBER_142(142l),
  
  NUMBER_143(143l),
  
  NUMBER_148(148l),
  
  NUMBER_149(149l),
  
  NUMBER_15(15l),
  
  NUMBER_150(150l),
  
  NUMBER_151(151l),
  
  NUMBER_152(152l),
  
  NUMBER_153(153l),
  
  NUMBER_154(154l),
  
  NUMBER_158(158l),
  
  NUMBER_159(159l),
  
  NUMBER_16(16l),
  
  NUMBER_160(160l),
  
  NUMBER_161(161l),
  
  NUMBER_162(162l),
  
  NUMBER_163(163l),
  
  NUMBER_164(164l),
  
  NUMBER_165(165l),
  
  NUMBER_166(166l),
  
  NUMBER_17(17l),
  
  NUMBER_18(18l),
  
  NUMBER_182(182l),
  
  NUMBER_183(183l),
  
  NUMBER_184(184l),
  
  NUMBER_186(186l),
  
  NUMBER_19(19l),
  
  NUMBER_2(2l),
  
  NUMBER_20(20l),
  
  NUMBER_21(21l),
  
  NUMBER_22(22l),
  
  NUMBER_221(221l),
  
  NUMBER_222(222l),
  
  NUMBER_23(23l),
  
  NUMBER_24(24l),
  
  NUMBER_25(25l),
  
  NUMBER_256(256l),
  
  NUMBER_257(257l),
  
  NUMBER_258(258l),
  
  NUMBER_26(26l),
  
  NUMBER_262(262l),
  
  NUMBER_263(263l),
  
  NUMBER_264(264l),
  
  NUMBER_265(265l),
  
  NUMBER_266(266l),
  
  NUMBER_267(267l),
  
  NUMBER_268(268l),
  
  NUMBER_269(269l),
  
  NUMBER_27(27l),
  
  NUMBER_270(270l),
  
  NUMBER_271(271l),
  
  NUMBER_28(28l),
  
  NUMBER_29(29l),
  
  NUMBER_3(3l),
  
  NUMBER_30(30l),
  
  NUMBER_31(31l),
  
  NUMBER_32(32l),
  
  NUMBER_33(33l),
  
  NUMBER_34(34l),
  
  NUMBER_35(35l),
  
  NUMBER_36(36l),
  
  NUMBER_37(37l),
  
  NUMBER_38(38l),
  
  NUMBER_39(39l),
  
  NUMBER_391(391l),
  
  NUMBER_392(392l),
  
  NUMBER_393(393l),
  
  NUMBER_394(394l),
  
  NUMBER_395(395l),
  
  NUMBER_4(4l),
  
  NUMBER_40(40l),
  
  NUMBER_41(41l),
  
  NUMBER_42(42l),
  
  NUMBER_43(43l),
  
  NUMBER_44(44l),
  
  NUMBER_45(45l),
  
  NUMBER_46(46l),
  
  NUMBER_47(47l),
  
  NUMBER_48(48l),
  
  NUMBER_49(49l),
  
  NUMBER_5(5l),
  
  NUMBER_50(50l),
  
  NUMBER_51(51l),
  
  NUMBER_52(52l),
  
  NUMBER_520(520l),
  
  NUMBER_53(53l),
  
  NUMBER_54(54l),
  
  NUMBER_55(55l),
  
  NUMBER_56(56l),
  
  NUMBER_57(57l),
  
  NUMBER_58(58l),
  
  NUMBER_59(59l),
  
  NUMBER_6(6l),
  
  NUMBER_60(60l),
  
  NUMBER_61(61l),
  
  NUMBER_62(62l),
  
  NUMBER_621(621l),
  
  NUMBER_622(622l),
  
  NUMBER_623(623l),
  
  NUMBER_63(63l),
  
  NUMBER_64(64l),
  
  NUMBER_65(65l),
  
  NUMBER_66(66l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l),
  
  NUMBER_94(94l),
  
  NUMBER_95(95l),
  
  NUMBER_96(96l),
  
  NUMBER_999(999l),
  
  NUMBER_9999(9999l);

  private Long value;

  AgentAdvCostReportListQueryV2DataListBusinessType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2DataListBusinessType fromValue(Long value) {
    for (AgentAdvCostReportListQueryV2DataListBusinessType b : AgentAdvCostReportListQueryV2DataListBusinessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2DataListBusinessType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2DataListBusinessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2DataListBusinessType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return AgentAdvCostReportListQueryV2DataListBusinessType.fromValue(value);
    }
  }
}

