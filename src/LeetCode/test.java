package LeetCode;

public class test {

    public static void main(String[] args) {


        String a = "{\n" +
                "\t\"resolveIndexFields\": {\n" +
                "\t\t\"msg\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"msg\",\n" +
                "\t\t\t\"label\": \"内容\",\n" +
                "\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"lock result: true\",\n" +
                "\t\t\t\"key\": \"msg\"\n" +
                "\t\t},\n" +
                "\t\t\"st\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"dateFormat\": \"yyyy-MM-dd HH:mm:ss.SSS\",\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"st\",\n" +
                "\t\t\t\"label\": \"日志时间\",\n" +
                "\t\t\t\"type\": \"date\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"2020-11-23 11:35:07.135\",\n" +
                "\t\t\t\"key\": \"st\"\n" +
                "\t\t},\n" +
                "\t\t\"level\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"level\",\n" +
                "\t\t\t\"label\": \"日志级别\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [\n" +
                "\t\t\t\t\"DEBUG\",\n" +
                "\t\t\t\t\"WARN\",\n" +
                "\t\t\t\t\"INFO\",\n" +
                "\t\t\t\t\"ERROR\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"INFO\",\n" +
                "\t\t\t\"key\": \"level\"\n" +
                "\t\t},\n" +
                "\t\t\"logger\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"logger\",\n" +
                "\t\t\t\"label\": \"类\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"c.k.ctsp.cloud.log.task.SourceTask\",\n" +
                "\t\t\t\"key\": \"logger\"\n" +
                "\t\t},\n" +
                "\t\t\"thread\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"thread\",\n" +
                "\t\t\t\"label\": \"线程\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1\",\n" +
                "\t\t\t\"key\": \"thread\"\n" +
                "\t\t},\n" +
                "\t\t\"tid\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"tid\",\n" +
                "\t\t\t\"label\": \"追踪链\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"-\",\n" +
                "\t\t\t\"key\": \"tid\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"throttle\": true,\n" +
                "\t\"supportSdk\": true,\n" +
                "\t\"kafkaTopic\": \"\",\n" +
                "\t\"regularExpression\": \"(?<st>\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(?<tid>.*?)\\\\]\\\\s)?\\\\[(?<thread>.+?)\\\\] (?<level>INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (?<logger>.*?) -(?<msg>[\\\\s\\\\S]*)$\",\n" +
                "\t\"nextLineKey\": \"msg\",\n" +
                "\t\"libraryId\": 1940,\n" +
                "\t\"retentionTime\": 3,\n" +
                "\t\"enableKafka\": false,\n" +
                "\t\"path\": \"/log/user/**.log\",\n" +
                "\t\"library\": {\n" +
                "\t\t\"lib\": \"emr\",\n" +
                "\t\t\"level\": \"COMMON\",\n" +
                "\t\t\"timeField\": \"__deal_millis__\",\n" +
                "\t\t\"updateTime\": 1683707851320,\n" +
                "\t\t\"type\": \"BUSINESS\",\n" +
                "\t\t\"projectMark\": \"${dname:emr}\",\n" +
                "\t\t\"major\": false,\n" +
                "\t\t\"createTime\": 1683707827537,\n" +
                "\t\t\"enable\": true,\n" +
                "\t\t\"name\": \"emr\",\n" +
                "\t\t\"updaterName\": \"jinhongwei\",\n" +
                "\t\t\"id\": 1940,\n" +
                "\t\t\"nameSpace\": \"${namespace:bigdata}\",\n" +
                "\t\t\"status\": 1\n" +
                "\t},\n" +
                "\t\"TEMPLATE\": {\n" +
                "\t\t\"method\": \"PUT\",\n" +
                "\t\t\"body\": {\n" +
                "\t\t\t\"mappings\": {\n" +
                "\t\t\t\t\"_doc\": {\n" +
                "\t\t\t\t\t\"properties\": {\n" +
                "\t\t\t\t\t\t\"msg\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"st\": {\n" +
                "\t\t\t\t\t\t\t\"format\": \"yyyy-MM-dd HH:mm:ss.SSS\",\n" +
                "\t\t\t\t\t\t\t\"type\": \"date\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__client_id__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"level\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"logger\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"thread\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"tid\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__sort__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__namespace__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__log__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"host\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__pod_name__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__log_rolling__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__deal_millis__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__filepath__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"timestamp\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"index_patterns\": [\n" +
                "\t\t\t\t\"flog_${dname:emr}_emr_*\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"order\": 1\n" +
                "\t\t},\n" +
                "\t\t\"url\": \"http://${es:dol-elasticsearch.kedacom-project-namespace:9200}/_template/flog_${dname:emr}_emr?include_type_name=true\"\n" +
                "\t},\n" +
                "\t\"id\": 30728,\n" +
                "\t\"nameSpace\": \"${namespace:bigdata}\",\n" +
                "\t\"logMode\": \"REGULAR_EXPRESSION\",\n" +
                "\t\"kafkaIps\": \"\",\n" +
                "\t\"logInterval\": 1,\n" +
                "\t\"refreshInterval\": 60,\n" +
                "\t\"supportSidecar\": true,\n" +
                "\t\"resolveFields\": \"[]\",\n" +
                "\t\"skipLongLines\": true,\n" +
                "\t\"bufferMaxSize\": 16,\n" +
                "\t\"sample\": \"2020-11-23 11:35:07.135 [TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1] INFO  c.k.ctsp.cloud.log.task.SourceTask -lock result: true\",\n" +
                "\t\"excludePath\": \"\",\n" +
                "\t\"indexFields\": \"[{\\\"search\\\":true,\\\"dateFormat\\\":\\\"yyyy-MM-dd HH:mm:ss.SSS\\\",\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"st\\\",\\\"label\\\":\\\"日志时间\\\",\\\"type\\\":\\\"date\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"2020-11-23 11:35:07.135\\\",\\\"key\\\":\\\"st\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"tid\\\",\\\"label\\\":\\\"追踪链\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"-\\\",\\\"key\\\":\\\"tid\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"thread\\\",\\\"label\\\":\\\"线程\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1\\\",\\\"key\\\":\\\"thread\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"level\\\",\\\"label\\\":\\\"日志级别\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[\\\"DEBUG\\\",\\\"WARN\\\",\\\"INFO\\\",\\\"ERROR\\\"],\\\"enableSplit\\\":false,\\\"value\\\":\\\"INFO\\\",\\\"key\\\":\\\"level\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"logger\\\",\\\"label\\\":\\\"类\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"c.k.ctsp.cloud.log.task.SourceTask\\\",\\\"key\\\":\\\"logger\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"msg\\\",\\\"label\\\":\\\"内容\\\",\\\"type\\\":\\\"text\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"lock result: true\\\",\\\"key\\\":\\\"msg\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__client_id__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__client_id__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__namespace__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__namespace__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__log__\\\",\\\"type\\\":\\\"text\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__log__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__deal_millis__\\\",\\\"type\\\":\\\"long\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__deal_millis__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__filepath__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__filepath__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__pod_name__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__pod_name__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__log_rolling__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__log_rolling__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"host\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"host\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"timestamp\\\",\\\"type\\\":\\\"long\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"timestamp\\\",\\\"isSave\\\":true}]\",\n" +
                "\t\"projectMark\": \"${dname:emr}\",\n" +
                "\t\"CONFIG_MAP\": {\n" +
                "\t\t\"filter-emr.conf\": \"[FILTER]\\n    Name    throttle\\n    Alias    throttle_emr\\n    Match    lib-emr.kube\\n    Rate    1000\\n    Window    300\\n    Interval    1s\\n\\n[FILTER]\\n    Name    parser\\n    Alias    parser_emr\\n    Match    lib-emr.kube\\n    Parser    metadata_parser_lib-emr\\n    Key_Name    __log__\\n    Preserve_Key    True\\n    Reserve_Data    True\\n\\n[FILTER]\\n    Name    record_modifier\\n    Alias    record_modifier_emr\\n    Match    lib-emr.kube\\n    Record __client_id__ ${COLLECTED_DEPLOY_NAME}\\n    Record __namespace__ ${PROJECT_NS}\\n    Record __pod_name__ ${POD_NAME}\\n    Record host ${NODE_NAME}\\n    Record __pro_lib__ ${COLLECTED_DEPLOY_NAME}_emr\\n\\n[FILTER]\\n    Name    lua\\n    Alias    lua_emr\\n    Match    lib-emr.kube\\n    script    simple-script.lua\\n    call    append_fields\\n    Type_int_key    __deal_millis__\\n\\n[FILTER]\\n    Name    modify\\n    Alias    modify_emr\\n    Match    lib-emr.kube\\n    Add host unknown\\n\",\n" +
                "\t\t\"input-emr.conf\": \"[INPUT]\\n    Name    tail\\n    Alias    tail_emr\\n    Path    /log/user/**.log\\n    Path_Key    __filepath__\\n    DB    /var/log/flb_emr.db\\n    Tag    lib-emr.kube\\n    Skip_Long_Lines    On\\n    Refresh_Interval    60s\\n    Buffer_Max_Size    16k\\n    Buffer_Chunk_Size    16k\\n    Mem_Buf_Limit    8MB\\n    Multiline    On\\n    Multiline_Flush    5\\n    Parser_Firstline    first_line_parser_lib-emr\\n\",\n" +
                "\t\t\"fluent-bit.conf\": \"[SERVICE]\\n    Flush    2\\n    Log_Level    error\\n    Daemon    off\\n    Parsers_File    parser-emr.conf\\n    HTTP_Listen     0.0.0.0\\n    HTTP_Port    2020\\n    HTTP_Server    Off\\n\\n@INCLUDE input-*.conf\\n@INCLUDE filter-*.conf\\n@INCLUDE output-*.conf\\n@INCLUDE simple-script.lua\\n\",\n" +
                "\t\t\"output-basic.conf\": \"[OUTPUT]\\n    Name    kafka\\n    Match    *\\n    Brokers    ${kafka:dol-kafka-0.dol-kafka.kedacom-project-namespace.svc.cluster.local:9092}\\n    Topics    services_log\\n    Timestamp_Key    timestamp\\n    Retry_Limit    False\\n    rdkafka.log.connection.close    false\\n    rdkafka.queue.buffering.max.kbytes    1048576\\n    rdkafka.request.required.acks    1\\n\",\n" +
                "\t\t\"parser-emr.conf\": \"[PARSER]\\n    Name    first_line_parser_lib-emr\\n    Format    regex\\n    Regex    (?<__log__>(\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(.*?)\\\\]\\\\s)?\\\\[(.+?)\\\\] (INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (.*?) -([\\\\s\\\\S]*)$)\\n\\n[PARSER]\\n    Name    metadata_parser_lib-emr\\n    Format    regex\\n    Regex    (?<st>\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(?<tid>.*?)\\\\]\\\\s)?\\\\[(?<thread>.+?)\\\\] (?<level>INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (?<logger>.*?) -(?<msg>[\\\\s\\\\S]*)$\\n    Time_Key    st\\n    Time_Keep    On\\n    Time_Format    %Y-%m-%d %H:%M:%S.%L\\n    Time_Offset    +0800\\n\",\n" +
                "\t\t\"simple-script.lua\": \"log_number=1000001 function append_fields(tag, timestamp, record) new_record = record log_number = log_number+1 new_record[\\\"__deal_millis__\\\"] = os.time()*1000 new_record[\\\"__log_rolling__\\\"] = os.date(\\\"%Y-%m-%d\\\", timestamp) new_record[\\\"__log_number__\\\"] =log_number return 1, timestamp, new_record end\"\n" +
                "\t},\n" +
                "\t\"inputPath\": \"\",\n" +
                "\t\"createTime\": 1683707851142,\n" +
                "\t\"multiline\": false,\n" +
                "\t\"timeFormat\": \"\",\n" +
                "\t\"samplingRate\": 1000,\n" +
                "\t\"singleLineMode\": false,\n" +
                "\t\"window\": 300,\n" +
                "\t\"timeKey\": \"st\",\n" +
                "\t\"status\": 1\n" +
                "}";

        String b = "{\n" +
                "\t\"resolveIndexFields\": {\n" +
                "\t\t\"msg\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"msg\",\n" +
                "\t\t\t\"label\": \"内容\",\n" +
                "\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"lock result: true\",\n" +
                "\t\t\t\"key\": \"msg\"\n" +
                "\t\t},\n" +
                "\t\t\"st\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"dateFormat\": \"yyyy-MM-dd HH:mm:ss.SSS\",\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"st\",\n" +
                "\t\t\t\"label\": \"日志时间\",\n" +
                "\t\t\t\"type\": \"date\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"2020-11-23 11:35:07.135\",\n" +
                "\t\t\t\"key\": \"st\"\n" +
                "\t\t},\n" +
                "\t\t\"level\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"level\",\n" +
                "\t\t\t\"label\": \"日志级别\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [\n" +
                "\t\t\t\t\"DEBUG\",\n" +
                "\t\t\t\t\"WARN\",\n" +
                "\t\t\t\t\"INFO\",\n" +
                "\t\t\t\t\"ERROR\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"INFO\",\n" +
                "\t\t\t\"key\": \"level\"\n" +
                "\t\t},\n" +
                "\t\t\"logger\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"logger\",\n" +
                "\t\t\t\"label\": \"类\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"c.k.ctsp.cloud.log.task.SourceTask\",\n" +
                "\t\t\t\"key\": \"logger\"\n" +
                "\t\t},\n" +
                "\t\t\"thread\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"thread\",\n" +
                "\t\t\t\"label\": \"线程\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1\",\n" +
                "\t\t\t\"key\": \"thread\"\n" +
                "\t\t},\n" +
                "\t\t\"tid\": {\n" +
                "\t\t\t\"search\": true,\n" +
                "\t\t\t\"enable\": true,\n" +
                "\t\t\t\"show\": true,\n" +
                "\t\t\t\"alias\": \"tid\",\n" +
                "\t\t\t\"label\": \"追踪链\",\n" +
                "\t\t\t\"type\": \"keyword\",\n" +
                "\t\t\t\"indexFieldEnum\": [],\n" +
                "\t\t\t\"enableSplit\": false,\n" +
                "\t\t\t\"value\": \"-\",\n" +
                "\t\t\t\"key\": \"tid\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"throttle\": true,\n" +
                "\t\"supportSdk\": true,\n" +
                "\t\"kafkaTopic\": \"\",\n" +
                "\t\"regularExpression\": \"(?<st>\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(?<tid>.*?)\\\\]\\\\s)?\\\\[(?<thread>.+?)\\\\] (?<level>INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (?<logger>.*?) -(?<msg>[\\\\s\\\\S]*)$\",\n" +
                "\t\"nextLineKey\": \"msg\",\n" +
                "\t\"libraryId\": 1940,\n" +
                "\t\"retentionTime\": 3,\n" +
                "\t\"enableKafka\": false,\n" +
                "\t\"path\": \"/log/user/**.log\",\n" +
                "\t\"library\": {\n" +
                "\t\t\"lib\": \"emr\",\n" +
                "\t\t\"level\": \"COMMON\",\n" +
                "\t\t\"timeField\": \"__deal_millis__\",\n" +
                "\t\t\"updateTime\": 1683707851320,\n" +
                "\t\t\"type\": \"BUSINESS\",\n" +
                "\t\t\"projectMark\": \"${dname:emr}\",\n" +
                "\t\t\"major\": false,\n" +
                "\t\t\"createTime\": 1683707827537,\n" +
                "\t\t\"enable\": true,\n" +
                "\t\t\"name\": \"emr\",\n" +
                "\t\t\"updaterName\": \"jinhongwei\",\n" +
                "\t\t\"id\": 1940,\n" +
                "\t\t\"nameSpace\": \"${namespace:bigdata}\",\n" +
                "\t\t\"status\": 1\n" +
                "\t},\n" +
                "\t\"TEMPLATE\": {\n" +
                "\t\t\"method\": \"PUT\",\n" +
                "\t\t\"body\": {\n" +
                "\t\t\t\"mappings\": {\n" +
                "\t\t\t\t\"_doc\": {\n" +
                "\t\t\t\t\t\"properties\": {\n" +
                "\t\t\t\t\t\t\"msg\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"st\": {\n" +
                "\t\t\t\t\t\t\t\"format\": \"yyyy-MM-dd HH:mm:ss.SSS\",\n" +
                "\t\t\t\t\t\t\t\"type\": \"date\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__client_id__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"level\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"logger\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"thread\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"tid\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__sort__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__namespace__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__log__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"host\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__pod_name__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__log_rolling__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__deal_millis__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"__filepath__\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t\"timestamp\": {\n" +
                "\t\t\t\t\t\t\t\"type\": \"long\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"index_patterns\": [\n" +
                "\t\t\t\t\"flog_${dname:emr}_emr_*\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"order\": 1\n" +
                "\t\t},\n" +
                "\t\t\"url\": \"http://${es:dol-elasticsearch.kedacom-project-namespace:9200}/_template/flog_${dname:emr}_emr?include_type_name=true\"\n" +
                "\t},\n" +
                "\t\"id\": 30728,\n" +
                "\t\"nameSpace\": \"${namespace:bigdata}\",\n" +
                "\t\"logMode\": \"REGULAR_EXPRESSION\",\n" +
                "\t\"kafkaIps\": \"\",\n" +
                "\t\"logInterval\": 1,\n" +
                "\t\"refreshInterval\": 60,\n" +
                "\t\"supportSidecar\": true,\n" +
                "\t\"resolveFields\": \"[]\",\n" +
                "\t\"skipLongLines\": true,\n" +
                "\t\"bufferMaxSize\": 16,\n" +
                "\t\"sample\": \"2020-11-23 11:35:07.135 [TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1] INFO  c.k.ctsp.cloud.log.task.SourceTask -lock result: true\",\n" +
                "\t\"excludePath\": \"\",\n" +
                "\t\"indexFields\": \"[{\\\"search\\\":true,\\\"dateFormat\\\":\\\"yyyy-MM-dd HH:mm:ss.SSS\\\",\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"st\\\",\\\"label\\\":\\\"日志时间\\\",\\\"type\\\":\\\"date\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"2020-11-23 11:35:07.135\\\",\\\"key\\\":\\\"st\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"tid\\\",\\\"label\\\":\\\"追踪链\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"-\\\",\\\"key\\\":\\\"tid\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"thread\\\",\\\"label\\\":\\\"线程\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"TID:7cab4414efe54321945f43b8c871a4f6.80.16145811237450679] [pool-7-thread-1\\\",\\\"key\\\":\\\"thread\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"level\\\",\\\"label\\\":\\\"日志级别\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[\\\"DEBUG\\\",\\\"WARN\\\",\\\"INFO\\\",\\\"ERROR\\\"],\\\"enableSplit\\\":false,\\\"value\\\":\\\"INFO\\\",\\\"key\\\":\\\"level\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"logger\\\",\\\"label\\\":\\\"类\\\",\\\"type\\\":\\\"keyword\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"c.k.ctsp.cloud.log.task.SourceTask\\\",\\\"key\\\":\\\"logger\\\",\\\"isSave\\\":true},{\\\"search\\\":true,\\\"enable\\\":true,\\\"show\\\":true,\\\"alias\\\":\\\"msg\\\",\\\"label\\\":\\\"内容\\\",\\\"type\\\":\\\"text\\\",\\\"indexFieldEnum\\\":[],\\\"enableSplit\\\":false,\\\"value\\\":\\\"lock result: true\\\",\\\"key\\\":\\\"msg\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__client_id__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__client_id__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__namespace__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__namespace__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__log__\\\",\\\"type\\\":\\\"text\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__log__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__deal_millis__\\\",\\\"type\\\":\\\"long\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__deal_millis__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__filepath__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__filepath__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__pod_name__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__pod_name__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"__log_rolling__\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"__log_rolling__\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"host\\\",\\\"type\\\":\\\"keyword\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"host\\\",\\\"isSave\\\":true},{\\\"op\\\":true,\\\"enable\\\":true,\\\"alias\\\":\\\"timestamp\\\",\\\"type\\\":\\\"long\\\",\\\"enableSplit\\\":false,\\\"key\\\":\\\"timestamp\\\",\\\"isSave\\\":true}]\",\n" +
                "\t\"projectMark\": \"${dname:emr}\",\n" +
                "\t\"CONFIG_MAP\": {\n" +
                "\t\t\"filter-emr.conf\": \"[FILTER]\\n    Name    throttle\\n    Alias    throttle_emr\\n    Match    lib-emr.kube\\n    Rate    1000\\n    Window    300\\n    Interval    1s\\n\\n[FILTER]\\n    Name    parser\\n    Alias    parser_emr\\n    Match    lib-emr.kube\\n    Parser    metadata_parser_lib-emr\\n    Key_Name    __log__\\n    Preserve_Key    True\\n    Reserve_Data    True\\n\\n[FILTER]\\n    Name    record_modifier\\n    Alias    record_modifier_emr\\n    Match    lib-emr.kube\\n    Record __client_id__ ${COLLECTED_DEPLOY_NAME}\\n    Record __namespace__ ${PROJECT_NS}\\n    Record __pod_name__ ${POD_NAME}\\n    Record host ${NODE_NAME}\\n    Record __pro_lib__ ${COLLECTED_DEPLOY_NAME}_emr\\n\\n[FILTER]\\n    Name    lua\\n    Alias    lua_emr\\n    Match    lib-emr.kube\\n    script    simple-script.lua\\n    call    append_fields\\n    Type_int_key    __deal_millis__\\n\\n[FILTER]\\n    Name    modify\\n    Alias    modify_emr\\n    Match    lib-emr.kube\\n    Add host unknown\\n\",\n" +
                "\t\t\"input-emr.conf\": \"[INPUT]\\n    Name    tail\\n    Alias    tail_emr\\n    Path    /log/user/**.log\\n    Path_Key    __filepath__\\n    DB    /var/log/flb_emr.db\\n    Tag    lib-emr.kube\\n    Skip_Long_Lines    On\\n    Refresh_Interval    60s\\n    Buffer_Max_Size    16k\\n    Buffer_Chunk_Size    16k\\n    Mem_Buf_Limit    8MB\\n    Multiline    On\\n    Multiline_Flush    5\\n    Parser_Firstline    first_line_parser_lib-emr\\n\",\n" +
                "\t\t\"fluent-bit.conf\": \"[SERVICE]\\n    Flush    2\\n    Log_Level    error\\n    Daemon    off\\n    Parsers_File    parser-emr.conf\\n    HTTP_Listen     0.0.0.0\\n    HTTP_Port    2020\\n    HTTP_Server    Off\\n\\n@INCLUDE input-*.conf\\n@INCLUDE filter-*.conf\\n@INCLUDE output-*.conf\\n@INCLUDE simple-script.lua\\n\",\n" +
                "\t\t\"output-basic.conf\": \"[OUTPUT]\\n    Name    kafka\\n    Match    *\\n    Brokers    ${kafka:dol-kafka-0.dol-kafka.kedacom-project-namespace.svc.cluster.local:9092}\\n    Topics    services_log\\n    Timestamp_Key    timestamp\\n    Retry_Limit    False\\n    rdkafka.log.connection.close    false\\n    rdkafka.queue.buffering.max.kbytes    1048576\\n    rdkafka.request.required.acks    1\\n\",\n" +
                "\t\t\"parser-emr.conf\": \"[PARSER]\\n    Name    first_line_parser_lib-emr\\n    Format    regex\\n    Regex    (?<__log__>(\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(.*?)\\\\]\\\\s)?\\\\[(.+?)\\\\] (INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (.*?) -([\\\\s\\\\S]*)$)\\n\\n[PARSER]\\n    Name    metadata_parser_lib-emr\\n    Format    regex\\n    Regex    (?<st>\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d \\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d.\\\\d\\\\d\\\\d) (\\\\[TID:\\\\s(?<tid>.*?)\\\\]\\\\s)?\\\\[(?<thread>.+?)\\\\] (?<level>INFO|ERROR|DEBUG|TRACE|WARN)\\\\s* (?<logger>.*?) -(?<msg>[\\\\s\\\\S]*)$\\n    Time_Key    st\\n    Time_Keep    On\\n    Time_Format    %Y-%m-%d %H:%M:%S.%L\\n    Time_Offset    +0800\\n\",\n" +
                "\t\t\"simple-script.lua\": \"log_number=1000001 function append_fields(tag, timestamp, record) new_record = record log_number = log_number+1 new_record[\\\"__deal_millis__\\\"] = os.time()*1000 new_record[\\\"__log_rolling__\\\"] = os.date(\\\"%Y-%m-%d\\\", timestamp) new_record[\\\"__log_number__\\\"] =log_number return 1, timestamp, new_record end\"\n" +
                "\t},\n" +
                "\t\"inputPath\": \"\",\n" +
                "\t\"createTime\": 1683707851142,\n" +
                "\t\"multiline\": false,\n" +
                "\t\"timeFormat\": \"\",\n" +
                "\t\"samplingRate\": 1000,\n" +
                "\t\"singleLineMode\": false,\n" +
                "\t\"window\": 300,\n" +
                "\t\"timeKey\": \"st\",\n" +
                "\t\"status\": 1\n" +
                "}";



    }

}
