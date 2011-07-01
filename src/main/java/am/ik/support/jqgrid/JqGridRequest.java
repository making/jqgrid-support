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
    private boolean _search;
    private String nd;
    private int rows = 10;
    private int page = 1;
    private String sidx;
    private String sord;

    public boolean is_search() {
        return _search;
    }

    public void set_search(boolean _search) {
        this._search = _search;
    }

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("JqGridRequest [_search=");
        builder.append(_search);
        builder.append(", ");
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
        }
        builder.append("]");
        return builder.toString();
    }

}
