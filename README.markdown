## About
jqgrid-support is a library for jqGrid (http://www.trirand.com/blog/). Especially with Spring MVC3.

## Examples

### Server Side

    /** sample data Class */
    public class Row {
        private String id;
        private String value;

        public Row(String id, String value) {
            this.id = id;
            this.value = value;
        }

        // setter, getter...
    }

    /** sample controller class of Spring MVC */
    @Controller
    public class SampleController {
        @RequestMapping("show")
        @ResponseBody
        public JqGridResponse<Row> show(JqGridRequest req) {
            // you can use requeset information.
            // ex. you can get a search index from req.getSidx();
            //                 a requested page from req.getPage();

            // sample data
            List<Row> rows = Arrays
                    .asList(new Row("1", "AAA"), new Row("2", "BBB"));

            // create json respose for jqGrid
            return new JqGridResponseBuilder<Row>().page(/* current page */1)
                    .records(/* size of total data */rows.size())
                    .total(/* total page*/1)
                    .addAll(/* data in current page */ rows).build();
        }
    }

When access to "&lt;contextRoot&gt;/show", the response is below.

`{"total":1,"page":1,"rows":[{"value":"AAA","id":"1"},{"value":"BBB","id":"2"}],"records":2}`

### Client Side

    <table id="gridTable"></table>
    <div id="gridPager"></div>


    $('#gridTable').jqGrid({
        url : 'show',
        datatype : 'json',
        colNames : [ 'id', 'value' ],
        colModel : [ {
            name : 'id',
            index : 'id',
            width : 50
        }, {
            name : 'value',
            index : 'value',
            width : 150
        }],
        rowNum : 5,
        pager : '#gridPager',
        sortname : 'id',
        viewrecords : true,
        sortorder : 'asc',
        caption : 'Sample Grid',
        jsonReader : {repeatitems : false} /* this setting is important!! */
    });

If the sample data class doesn't have "id" field, you have to set alternative `id` key to `jsonReader`.
When the field name of `id` key is "foo", you have to set obviously like below.

     jsonReader : {repeatitems : false, id : 'foo'}

"id" is the default value of `id` key.

## Use with Maven

At first, add repository in your pom.

    <repositories>
        ...

        <repository>
            <id>making-dropbox-releases</id>
            <name>making's Maven Release Repository</name>
            <url>http://dl.dropbox.com/u/342817/maven/releases</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

And add dependency.

    <dependencies>
        ...

        <dependency>
            <groupId>am.ik.support.jqgrid</groupId>
            <artifactId>jqgrid-support</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>


## License

Licensed under the Apache License, Version 2.0.