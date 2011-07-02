/*
 * Copyright (C) 2011 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package am.ik.support.jqgrid;

public class JqGridRequest {
    private String nd;
    private int rows;
    private int page;
    private String sidx;
    private String sord;
    private String searchField;
    private String searchString;
    private String searchOper;
    private String filters;

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("JqGridRequest [");
        if (nd != null) {
            builder.append("nd=");
            builder.append(nd);
            builder.append(", ");
        }
        builder.append("rows=");
        builder.append(rows);
        builder.append(", page=");
        builder.append(page);
        builder.append(", ");
        if (sidx != null) {
            builder.append("sidx=");
            builder.append(sidx);
            builder.append(", ");
        }
        if (sord != null) {
            builder.append("sord=");
            builder.append(sord);
            builder.append(", ");
        }
        if (searchField != null) {
            builder.append("searchField=");
            builder.append(searchField);
            builder.append(", ");
        }
        if (searchString != null) {
            builder.append("searchString=");
            builder.append(searchString);
            builder.append(", ");
        }
        if (searchOper != null) {
            builder.append("searchOper=");
            builder.append(searchOper);
            builder.append(", ");
        }
        if (filters != null) {
            builder.append("filters=");
            builder.append(filters);
        }
        builder.append("]");
        return builder.toString();
    }

}
