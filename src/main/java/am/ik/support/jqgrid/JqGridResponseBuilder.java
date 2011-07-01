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

import java.util.ArrayList;
import java.util.Collection;

public class JqGridResponseBuilder<T> {
    private JqGridResponse<T> response = new JqGridResponse<T>();

    public JqGridResponseBuilder() {
        response.setRows(new ArrayList<T>());
    }

    public JqGridResponse<T> build() {
        return response;
    }

    public JqGridResponseBuilder<T> page(int page) {
        response.setPage(page);
        return this;
    }

    public JqGridResponseBuilder<T> total(int total) {
        response.setTotal(total);
        return this;
    }

    public JqGridResponseBuilder<T> records(int records) {
        response.setRecords(records);
        return this;
    }

    public JqGridResponseBuilder<T> add(T row) {
        response.getRows().add(row);
        return this;
    }

    public JqGridResponseBuilder<T> addAll(Collection<T> rows) {
        response.getRows().addAll(rows);
        return this;
    }
}
