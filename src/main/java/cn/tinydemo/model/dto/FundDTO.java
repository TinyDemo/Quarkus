package cn.tinydemo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.List;

/**
 * @author where
 */
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundDTO {
    public Integer code;
    public String message;
    public List<Fund> data;
    public String meta;

    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Fund {
        /**
         * 基金代码
         */
        public String code;
        public String name;
        public String netWorthDate;
        public String netWorth;
        public String dayGrowth;
        public String expectWorthDate;
        public String expectWorth;
        public String expectGrowth;
        public String lastWeekGrowth;
        public String lastMonthGrowth;
        public String lastThreeMonthsGrowth;
        public String lastSixMonthsGrowth;
        public String lastYearGrowth;
    }
}
