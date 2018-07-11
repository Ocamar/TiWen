<#include "/template/liferaytags/init.ftl">

<div style="text-align: center;">
    <div id="chars-today" style="width: 1100px;height:400px;"></div>
</div>

<@aui.script>
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('chars-today'));

    // 指定图表的配置项和数据
    option = {
        title : {
            text: '姓名：${name!}',
            subtext: '床位编号：${bedNo!}'
        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['今日体温']
        },
        toolbox: {
            show : true,
            feature : {
                dataZoom: {},
                dataView: {readOnly: false},
                magicType: {type: ['line', 'bar']},
                restore: {},
                saveAsImage: {}
            }
        },
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : ['0','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19',
                        '20','21','22','23','24'],
                axisLabel: {
                    interval: 0,
                    formatter: function (value) {
                        return (value) + ':00';
                    }
                }
            }
        ],
        yAxis : [
            {
                type : 'value',
                min: 30,
                max: 45,
                axisLabel : {
                    formatter: function (value) {
                        return (value) + '°C';
                    }
                }
            }
        ],
        series : [
            {
                name:'体温',
                type:'line',
                data:${temperatureArray!},
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                }
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</@aui.script>