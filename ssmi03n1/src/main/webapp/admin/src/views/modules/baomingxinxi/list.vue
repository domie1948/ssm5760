<template>
  <div class="main-content">
    <!-- 列表页 -->
    <div v-if="showFlag">
      <el-form :inline="true" :model="searchForm" class="form-content">
        <el-row :gutter="20" class="slt" :style="{justifyContent:contents.searchBoxPosition=='1'?'flex-start':contents.searchBoxPosition=='2'?'center':'flex-end'}">
                                                    <el-form-item :label="contents.inputTitle == 1 ? '考试名称' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.kaoshimingcheng" placeholder="考试名称" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.kaoshimingcheng" placeholder="考试名称" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.kaoshimingcheng" placeholder="考试名称" clearable></el-input>
                </el-form-item>
                                                                                                    <el-form-item :label="contents.inputTitle == 1 ? '考生号' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.kaoshenghao" placeholder="考生号" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.kaoshenghao" placeholder="考生号" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.kaoshenghao" placeholder="考生号" clearable></el-input>
                </el-form-item>
                                                                                                                          <el-form-item :label="contents.inputTitle == 1 ? '专业名称' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.zhuanyemingcheng" placeholder="专业名称" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.zhuanyemingcheng" placeholder="专业名称" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.zhuanyemingcheng" placeholder="专业名称" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '考生账号' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.kaoshengzhanghao" placeholder="考生账号" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.kaoshengzhanghao" placeholder="考生账号" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.kaoshengzhanghao" placeholder="考生账号" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '考生姓名' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.kaoshengxingming" placeholder="考生姓名" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.kaoshengxingming" placeholder="考生姓名" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.kaoshengxingming" placeholder="考生姓名" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '性别' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.xingbie" placeholder="性别" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.xingbie" placeholder="性别" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.xingbie" placeholder="性别" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '专业' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.zhuanye" placeholder="专业" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.zhuanye" placeholder="专业" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.zhuanye" placeholder="专业" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '省份' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.shengfen" placeholder="省份" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.shengfen" placeholder="省份" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.shengfen" placeholder="省份" clearable></el-input>
                </el-form-item>
                                                                              <el-form-item :label="contents.inputTitle == 1 ? '学校' : ''">
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 1" prefix-icon="el-icon-search" v-model="searchForm.xuexiao" placeholder="学校" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 1 && contents.inputIconPosition == 2" suffix-icon="el-icon-search" v-model="searchForm.xuexiao" placeholder="学校" clearable></el-input>
                  <el-input v-if="contents.inputIcon == 0" v-model="searchForm.xuexiao" placeholder="学校" clearable></el-input>
                </el-form-item>
                                                                                                                                                                                                                              <el-form-item>
            <el-button v-if="contents.searchBtnIcon == 1 && contents.searchBtnIconPosition == 1" icon="el-icon-search" type="success" @click="search()">{{ contents.searchBtnFont == 1?'查询':'' }}</el-button>
            <el-button v-if="contents.searchBtnIcon == 1 && contents.searchBtnIconPosition == 2" type="success" @click="search()">{{ contents.searchBtnFont == 1?'查询':'' }}<i class="el-icon-search el-icon--right"/></el-button>
            <el-button v-if="contents.searchBtnIcon == 0" type="success" @click="search()">{{ contents.searchBtnFont == 1?'查询':'' }}</el-button>
          </el-form-item>
        </el-row>
        <el-row class="ad" :style="{justifyContent:contents.btnAdAllBoxPosition=='1'?'flex-start':contents.btnAdAllBoxPosition=='2'?'center':'flex-end'}">
          <el-form-item>
            <el-button
              v-if="isAuth('baomingxinxi','新增') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 1"
              type="success"
              icon="el-icon-plus"
              @click="addOrUpdateHandler()"
            >{{ contents.btnAdAllFont == 1?'新增':'' }}</el-button>
            <el-button
              v-if="isAuth('baomingxinxi','新增') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 2"
              type="success"
              @click="addOrUpdateHandler()"
            >{{ contents.btnAdAllFont == 1?'新增':'' }}<i class="el-icon-plus el-icon--right" /></el-button>
            <el-button
              v-if="isAuth('baomingxinxi','新增') && contents.btnAdAllIcon == 0"
              type="success"
              @click="addOrUpdateHandler()"
            >{{ contents.btnAdAllFont == 1?'新增':'' }}</el-button>
            <el-button
              v-if="isAuth('baomingxinxi','删除') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 1 && contents.tableSelection"
              :disabled="dataListSelections.length <= 0"
              type="danger"
              icon="el-icon-delete"
              @click="deleteHandler()"
            >{{ contents.btnAdAllFont == 1?'删除':'' }}</el-button>
            <el-button
              v-if="isAuth('baomingxinxi','删除') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 2 && contents.tableSelection"
              :disabled="dataListSelections.length <= 0"
              type="danger"
              @click="deleteHandler()"
            >{{ contents.btnAdAllFont == 1?'删除':'' }}<i class="el-icon-delete el-icon--right" /></el-button>
            <el-button
              v-if="isAuth('baomingxinxi','删除') && contents.btnAdAllIcon == 0 && contents.tableSelection"
              :disabled="dataListSelections.length <= 0"
              type="danger"
              @click="deleteHandler()"
            >{{ contents.btnAdAllFont == 1?'删除':'' }}</el-button>

	    <download-excel v-if="isAuth('baomingxinxi','导出')" class = "export-excel-wrapper" :data = "dataList" :fields = "json_fields" name = "报名信息.xls">
		      <!-- 导出excel -->
            	<el-button
              	v-if="contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 1"
              	type="primary"
              	icon="el-icon-download"
            	>{{ contents.btnAdAllFont == 1?'导出':'' }}</el-button>
            	<el-button
              	v-if="contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 2"
              	type="primary"
            	>{{ contents.btnAdAllFont == 1?'导出':'' }}<i class="el-icon-download el-icon--right" /></el-button>
            	<el-button
              	v-if="contents.btnAdAllIcon == 0"
              	type="primary"
            	>{{ contents.btnAdAllFont == 1?'导出':'' }}</el-button>
       	    </download-excel>
            <el-button
              v-if="isAuth('baomingxinxi','打印') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 1"
              type="success"
              icon="el-icon-printer"
              @click="printJson"
            >{{ contents.btnAdAllFont == 1?'打印':'' }}</el-button>
            <el-button
              v-if="isAuth('baomingxinxi','打印') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 2"
              type="success"
              @click="printJson"
            >{{ contents.btnAdAllFont == 1?'打印':'' }}<i class="el-icon-printer el-icon--right" /></el-button>
            <el-button
              v-if="isAuth('baomingxinxi','打印') && contents.btnAdAllIcon == 0"
              type="success"
              @click="printJson"
            >{{ contents.btnAdAllFont == 1?'打印':'' }}</el-button>

                        <el-button
              v-if="isAuth('baomingxinxi','报表') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 1"
              type="warning"
              icon="el-icon-s-data"
              @click="chartDialog()"
            >{{ contents.btnAdAllFont == 1?'统计报表':'' }}</el-button>
            <el-button
              v-if="isAuth('baomingxinxi','报表') && contents.btnAdAllIcon == 1 && contents.btnAdAllIconPosition == 2"
              type="warning"
              @click="chartDialog()"
            >{{ contents.btnAdAllFont == 1?'统计报表':'' }}<i class="el-icon-s-data el-icon--right" /></el-button>
            <el-button
              v-if="isAuth('baomingxinxi','报表') && contents.btnAdAllIcon == 0"
              type="warning"
              @click="chartDialog()"
            >{{ contents.btnAdAllFont == 1?'统计报表':'' }}</el-button>
                      </el-form-item>
        </el-row>
      </el-form>
      <div class="table-content">
        <el-table class="tables" :size="contents.tableSize" :show-header="contents.tableShowHeader"
            :header-row-style="headerRowStyle" :header-cell-style="headerCellStyle"
            :border="contents.tableBorder"
            :fit="contents.tableFit"
            :stripe="contents.tableStripe"
            :row-style="rowStyle"
            :cell-style="cellStyle"
            :style="{width: '100%',fontSize:contents.tableContentFontSize,color:contents.tableContentFontColor}"
            v-if="isAuth('baomingxinxi','查看')"
            :data="dataList"
            v-loading="dataListLoading"
            @selection-change="selectionChangeHandler">
            <el-table-column  v-if="contents.tableSelection"
                type="selection"
                header-align="center"
                align="center"
                width="50">
            </el-table-column>
            <el-table-column label="索引" v-if="contents.tableIndex" type="index" width="50" />
            	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshimingcheng"
                    header-align="center"
		    label="考试名称">
		     <template slot-scope="scope">
                       {{scope.row.kaoshimingcheng}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshishijian"
                    header-align="center"
		    label="考试时间">
		     <template slot-scope="scope">
                       {{scope.row.kaoshishijian}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshenghao"
                    header-align="center"
		    label="考生号">
		     <template slot-scope="scope">
                       {{scope.row.kaoshenghao}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="baokaofeiyong"
                    header-align="center"
		    label="报考费用">
		     <template slot-scope="scope">
                       {{scope.row.baokaofeiyong}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshidizhi"
                    header-align="center"
		    label="考试地址">
		     <template slot-scope="scope">
                       {{scope.row.kaoshidizhi}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="zhuanyemingcheng"
                    header-align="center"
		    label="专业名称">
		     <template slot-scope="scope">
                       {{scope.row.zhuanyemingcheng}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshengzhanghao"
                    header-align="center"
		    label="考生账号">
		     <template slot-scope="scope">
                       {{scope.row.kaoshengzhanghao}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="kaoshengxingming"
                    header-align="center"
		    label="考生姓名">
		     <template slot-scope="scope">
                       {{scope.row.kaoshengxingming}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="xingbie"
                    header-align="center"
		    label="性别">
		     <template slot-scope="scope">
                       {{scope.row.xingbie}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="zhuanye"
                    header-align="center"
		    label="专业">
		     <template slot-scope="scope">
                       {{scope.row.zhuanye}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="shengfen"
                    header-align="center"
		    label="省份">
		     <template slot-scope="scope">
                       {{scope.row.shengfen}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="xuexiao"
                    header-align="center"
		    label="学校">
		     <template slot-scope="scope">
                       {{scope.row.xuexiao}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="lianxidianhua"
                    header-align="center"
		    label="联系电话">
		     <template slot-scope="scope">
                       {{scope.row.lianxidianhua}}
                     </template>
                </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="nianling"
                    header-align="center"
		    label="年龄">
		     <template slot-scope="scope">
                       {{scope.row.nianling}}
                     </template>
                </el-table-column>
                	                	                                      <el-table-column :sortable="contents.tableSortable" :align="contents.tableAlign" prop="touxiang"
                    header-align="center"
                    width="200"
                    label="头像">
                    <template slot-scope="scope">
                      <div v-if="scope.row.touxiang">
                        <img :src="scope.row.touxiang.split(',')[0]" width="100" height="100">
                      </div>
                      <div v-else>无图片</div>
                    </template>
                  </el-table-column>
                	                	                                    <el-table-column  :sortable="contents.tableSortable" :align="contents.tableAlign"
                    prop="baomingshijian"
                    header-align="center"
		    label="报名时间">
		     <template slot-scope="scope">
                       {{scope.row.baomingshijian}}
                     </template>
                </el-table-column>
                	                	                                    	                	                                    	                	                                    	                	                                    <el-table-column
                  :sortable="contents.tableSortable" :align="contents.tableAlign"
                  prop="ispay"
                  header-align="center"
                  label="是否支付">
                  <template slot-scope="scope">
                    <span style="margin-right:10px">{{scope.row.ispay=='已支付'?'已支付':'未支付'}}</span>
                    <el-button v-if="scope.row.ispay!='已支付' && isAuth('baomingxinxi','支付') " type="text" icon="el-icon-edit" size="small" @click="payHandler(scope.row)">支付</el-button>
                  </template>
                </el-table-column>
                	                                          <el-table-column :sortable="contents.tableSortable" :align="contents.tableAlign"
                  prop="shhf"
                  header-align="center"
                  label="审核回复">
              </el-table-column>
              <el-table-column :sortable="contents.tableSortable" :align="contents.tableAlign"
                  prop="sfsh"
                  header-align="center"
                  label="审核状态">
                  <template slot-scope="scope">
                    <span style="margin-right:10px">{{scope.row.sfsh=='是'?'通过':'未通过'}}</span>
                  </template>
              </el-table-column>
              <el-table-column :sortable="contents.tableSortable" :align="contents.tableAlign"
                  v-if="isAuth('baomingxinxi','审核')"
                  prop="sfsh"
                  header-align="center"
                  label="审核">
                  <template slot-scope="scope">
                    <el-button  type="text" icon="el-icon-edit" size="small" @click="shDialog(scope.row)">审核</el-button>
                  </template>
              </el-table-column>
                        <el-table-column width="300" :align="contents.tableAlign"
                header-align="center"
                label="操作">
                <template slot-scope="scope">
                                <el-button v-if="isAuth('baomingxinxi','查看') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 1" type="success" icon="el-icon-tickets" size="mini" @click="addOrUpdateHandler(scope.row.id,'info')">{{ contents.tableBtnFont == 1?'详情':'' }}</el-button>
                <el-button v-if="isAuth('baomingxinxi','查看') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 2" type="success" size="mini" @click="addOrUpdateHandler(scope.row.id,'info')">{{ contents.tableBtnFont == 1?'详情':'' }}<i class="el-icon-tickets el-icon--right" /></el-button>
                <el-button v-if="isAuth('baomingxinxi','查看') && contents.tableBtnIcon == 0" type="success" size="mini" @click="addOrUpdateHandler(scope.row.id,'info')">{{ contents.tableBtnFont == 1?'详情':'' }}</el-button>
                                                                <el-button v-if="isAuth('baomingxinxi','成绩') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 1" type="success" icon="el-icon-tickets" size="mini" @click="kaoshengchengjiCrossAddOrUpdateHandler(scope.row,'cross')">{{ contents.tableBtnFont == 1?'成绩':'' }}</el-button>
                <el-button v-if="isAuth('baomingxinxi','成绩') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 2" type="success" size="mini" @click="kaoshengchengjiCrossAddOrUpdateHandler(scope.row,'cross')">{{ contents.tableBtnFont == 1?'成绩':'' }}<i class="el-icon-tickets el-icon--right" /></el-button>
                <el-button v-if="isAuth('baomingxinxi','成绩') && contents.tableBtnIcon == 0" type="success" size="mini" @click="kaoshengchengjiCrossAddOrUpdateHandler(scope.row,'cross')">{{ contents.tableBtnFont == 1?'成绩':'' }}</el-button>
                                                                <el-button v-if="isAuth('baomingxinxi','修改') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 1" type="primary" icon="el-icon-edit" size="mini" @click="addOrUpdateHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'修改':'' }}</el-button>
                <el-button v-if="isAuth('baomingxinxi','修改') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 2" type="primary" size="mini" @click="addOrUpdateHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'修改':'' }}<i class="el-icon-edit el-icon--right" /></el-button>
                <el-button v-if="isAuth('baomingxinxi','修改') && contents.tableBtnIcon == 0" type="primary" size="mini" @click="addOrUpdateHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'修改':'' }}</el-button>




                <el-button v-if="isAuth('baomingxinxi','删除') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 1" type="danger" icon="el-icon-delete" size="mini" @click="deleteHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'删除':'' }}</el-button>
                <el-button v-if="isAuth('baomingxinxi','删除') && contents.tableBtnIcon == 1 && contents.tableBtnIconPosition == 2" type="danger" size="mini" @click="deleteHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'删除':'' }}<i class="el-icon-delete el-icon--right" /></el-button>
                <el-button v-if="isAuth('baomingxinxi','删除') && contents.tableBtnIcon == 0" type="danger" size="mini" @click="deleteHandler(scope.row.id)">{{ contents.tableBtnFont == 1?'删除':'' }}</el-button>
                </template>
            </el-table-column>
        </el-table>
                                                                                                                                                                                                                                                                                                                                                <el-pagination
          clsss="pages"
          :layout="layouts"
          @size-change="sizeChangeHandle"
          @current-change="currentChangeHandle"
          :current-page="pageIndex"
          :page-sizes="[10, 20, 50, 100]"
          :page-size="Number(contents.pageEachNum)"
          :total="totalPage"
          :small="contents.pageStyle"
          class="pagination-content"
          :background="contents.pageBtnBG"
          :style="{textAlign:contents.pagePosition==1?'left':contents.pagePosition==2?'center':'right'}"
        ></el-pagination>
      </div>
    </div>
    <!-- 添加/修改页面  将父组件的search方法传递给子组件-->
    <add-or-update v-if="addOrUpdateFlag" :parent="this" ref="addOrUpdate"></add-or-update>

            <kaoshengchengji-cross-add-or-update v-if="kaoshengchengjiCrossAddOrUpdateFlag" :parent="this" ref="kaoshengchengjiCrossaddOrUpdate"></kaoshengchengji-cross-add-or-update>
        
        <el-dialog
      title="审核"
      :visible.sync="sfshVisiable"
      width="50%">
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="审核状态">
          <el-select v-model="shForm.sfsh" placeholder="审核状态">
            <el-option label="通过" value="是"></el-option>
            <el-option label="不通过" value="否"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="内容">
          <el-input type="textarea" :rows="8" v-model="shForm.shhf"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="shDialog">取 消</el-button>
        <el-button type="primary" @click="shHandler">确 定</el-button>
      </span>
    </el-dialog>
    
        <el-dialog
      title="统计报表"
      :visible.sync="chartVisiable"
      width="800">
                                                                                                                                      <div id="xingbieChart" style="width:100%;height:600px;"></div>
                                                                                                                                                                              <span slot="footer" class="dialog-footer">
        <el-button @click="chartDialog">返回</el-button>
      </span>
    </el-dialog>
      </div>
</template>
<script>
import AddOrUpdate from "./add-or-update";
import kaoshengchengjiCrossAddOrUpdate from "../kaoshengchengji/add-or-update";
export default {
  data() {
    return {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                searchForm: {
        key: ""
      },
      dataList: [],
      pageIndex: 1,
      pageSize: 10,
      totalPage: 0,
      dataListLoading: false,
      dataListSelections: [],
      showFlag: true,
      sfshVisiable: false,
      shForm: {},
      chartVisiable: false,
      addOrUpdateFlag:false,
                  kaoshengchengjiCrossAddOrUpdateFlag: false,
                  contents:{"searchBtnFontColor":"rgba(0, 0, 0, 1)","pagePosition":"1","inputFontSize":"14px","inputBorderRadius":"0px","tableBtnDelFontColor":"#333","tableBtnIconPosition":"1","searchBtnHeight":"40px","inputIconColor":"rgba(0, 0, 0, 1)","searchBtnBorderRadius":"4px","tableStripe":true,"btnAdAllWarnFontColor":"#333","tableBtnDelBgColor":"rgba(204, 255, 102, 1)","searchBtnIcon":"1","tableSize":"medium","searchBtnBorderStyle":"groove","tableSelection":true,"searchBtnBorderWidth":"1px","tableContentFontSize":"14px","searchBtnBgColor":"#fff","inputTitleSize":"14px","btnAdAllBorderColor":"#DCDFE6","pageJumper":true,"btnAdAllIconPosition":"1","searchBoxPosition":"1","tableBtnDetailFontColor":"#333","tableBtnHeight":"40px","pagePager":true,"searchBtnBorderColor":"rgba(130, 131, 133, 1)","tableHeaderFontColor":"#909399","inputTitle":"1","tableBtnBorderRadius":"4px","btnAdAllFont":"0","btnAdAllDelFontColor":"#333","tableBtnIcon":"1","btnAdAllHeight":"40px","btnAdAllWarnBgColor":"rgba(204, 255, 102, 1)","btnAdAllBorderWidth":"1px","tableStripeFontColor":"#606266","tableBtnBorderStyle":"solid","inputHeight":"40px","btnAdAllBorderRadius":"4px","btnAdAllDelBgColor":"rgba(102, 204, 255, 1)","pagePrevNext":true,"btnAdAllAddBgColor":"rgba(117, 113, 249, 1)","searchBtnFont":"1","tableIndex":true,"btnAdAllIcon":"1","tableSortable":false,"pageSizes":true,"tableFit":true,"pageBtnBG":true,"searchBtnFontSize":"15px","tableBtnEditBgColor":"rgba(102, 204, 255, 1)","inputBorderWidth":"2px","inputFontPosition":"1","inputFontColor":"rgba(0, 0, 0, 1)","pageEachNum":10,"tableHeaderBgColor":"#fff","inputTitleColor":"#333","btnAdAllBoxPosition":"3","tableBtnDetailBgColor":"rgba(117, 113, 249, 1)","inputIcon":"1","searchBtnIconPosition":"1","btnAdAllFontSize":"14px","inputBorderStyle":"none none solid none ","inputBgColor":"rgba(117, 113, 249, 0.09)","pageStyle":false,"pageTotal":true,"btnAdAllAddFontColor":"#333","tableBtnFont":"1","tableContentFontColor":"#606266","inputBorderColor":"rgba(115, 115, 115, 1)","tableShowHeader":true,"tableBtnFontSize":"14px","tableBtnBorderColor":"#DCDFE6","inputIconPosition":"2","tableBorder":true,"btnAdAllBorderStyle":"solid","tableBtnBorderWidth":"1px","tableStripeBgColor":"#F5F7FA","tableBtnEditFontColor":"#333","tableAlign":"center"},
      layouts: '',

//导出excel
      json_fields: {
      "考试名称": "kaoshimingcheng",    //常规字段
      "考试时间": "kaoshishijian",    //常规字段
      "考生号": "kaoshenghao",    //常规字段
      "报考费用": "baokaofeiyong",    //常规字段
      "考试地址": "kaoshidizhi",    //常规字段
      "专业名称": "zhuanyemingcheng",    //常规字段
      "考生账号": "kaoshengzhanghao",    //常规字段
      "考生姓名": "kaoshengxingming",    //常规字段
      "性别": "xingbie",    //常规字段
      "专业": "zhuanye",    //常规字段
      "省份": "shengfen",    //常规字段
      "学校": "xuexiao",    //常规字段
      "联系电话": "lianxidianhua",    //常规字段
      "年龄": "nianling",    //常规字段
      "头像": "touxiang",    //常规字段
      "报名时间": "baomingshijian",    //常规字段
      "备注": "beizhu",    //常规字段
      "是否审核": "sfsh",    //常规字段
      "审核回复": "shhf",    //常规字段
      "是否支付": "ispay",    //常规字段
      },
      json_meta: [
        [
          {
            " key ": " charset ",
            " value ": " utf- 8 "
          }
        ]
      ]

    };
  },
  created() {
    this.init();
    this.getDataList();
    this.contentStyleChange()
  },
  mounted() {

  },
  filters: {
    htmlfilter: function (val) {
      return val.replace(/<[^>]*>/g).replace(/undefined/g,'');
    }
  },
  components: {
    AddOrUpdate,
            kaoshengchengjiCrossAddOrUpdate,
          },
  methods: {
    contentStyleChange() {
      this.contentSearchStyleChange()
      this.contentBtnAdAllStyleChange()
      this.contentSearchBtnStyleChange()
      this.contentTableBtnStyleChange()
      this.contentPageStyleChange()
    },
    contentSearchStyleChange() {
      this.$nextTick(()=>{
        document.querySelectorAll('.form-content .slt .el-input__inner').forEach(el=>{
          let textAlign = 'left'
          if(this.contents.inputFontPosition == 2) textAlign = 'center'
          if(this.contents.inputFontPosition == 3) textAlign = 'right'
          el.style.textAlign = textAlign
          el.style.height = this.contents.inputHeight
          el.style.lineHeight = this.contents.inputHeight
          el.style.color = this.contents.inputFontColor
          el.style.fontSize = this.contents.inputFontSize
          el.style.borderWidth = this.contents.inputBorderWidth
          el.style.borderStyle = this.contents.inputBorderStyle
          el.style.borderColor = this.contents.inputBorderColor
          el.style.borderRadius = this.contents.inputBorderRadius
          el.style.backgroundColor = this.contents.inputBgColor
        })
        if(this.contents.inputTitle) {
          document.querySelectorAll('.form-content .slt .el-form-item__label').forEach(el=>{
            el.style.color = this.contents.inputTitleColor
            el.style.fontSize = this.contents.inputTitleSize
            el.style.lineHeight = this.contents.inputHeight
          })
        }
        setTimeout(()=>{
          document.querySelectorAll('.form-content .slt .el-input__prefix').forEach(el=>{
            el.style.color = this.contents.inputIconColor
            el.style.lineHeight = this.contents.inputHeight
          })
          document.querySelectorAll('.form-content .slt .el-input__suffix').forEach(el=>{
            el.style.color = this.contents.inputIconColor
            el.style.lineHeight = this.contents.inputHeight
          })
          document.querySelectorAll('.form-content .slt .el-input__icon').forEach(el=>{
            el.style.lineHeight = this.contents.inputHeight
          })
        },10)

      })
    },
    // 搜索按钮
    contentSearchBtnStyleChange() {
      this.$nextTick(()=>{
        document.querySelectorAll('.form-content .slt .el-button--success').forEach(el=>{
          el.style.height = this.contents.searchBtnHeight
          el.style.color = this.contents.searchBtnFontColor
          el.style.fontSize = this.contents.searchBtnFontSize
          el.style.borderWidth = this.contents.searchBtnBorderWidth
          el.style.borderStyle = this.contents.searchBtnBorderStyle
          el.style.borderColor = this.contents.searchBtnBorderColor
          el.style.borderRadius = this.contents.searchBtnBorderRadius
          el.style.backgroundColor = this.contents.searchBtnBgColor
        })
      })
    },
    // 新增、批量删除
    contentBtnAdAllStyleChange() {
      this.$nextTick(()=>{
        document.querySelectorAll('.form-content .ad .el-button--success').forEach(el=>{
          el.style.height = this.contents.btnAdAllHeight
          el.style.color = this.contents.btnAdAllAddFontColor
          el.style.fontSize = this.contents.btnAdAllFontSize
          el.style.borderWidth = this.contents.btnAdAllBorderWidth
          el.style.borderStyle = this.contents.btnAdAllBorderStyle
          el.style.borderColor = this.contents.btnAdAllBorderColor
          el.style.borderRadius = this.contents.btnAdAllBorderRadius
          el.style.backgroundColor = this.contents.btnAdAllAddBgColor
        })
        document.querySelectorAll('.form-content .ad .el-button--danger').forEach(el=>{
          el.style.height = this.contents.btnAdAllHeight
          el.style.color = this.contents.btnAdAllDelFontColor
          el.style.fontSize = this.contents.btnAdAllFontSize
          el.style.borderWidth = this.contents.btnAdAllBorderWidth
          el.style.borderStyle = this.contents.btnAdAllBorderStyle
          el.style.borderColor = this.contents.btnAdAllBorderColor
          el.style.borderRadius = this.contents.btnAdAllBorderRadius
          el.style.backgroundColor = this.contents.btnAdAllDelBgColor
        })
        document.querySelectorAll('.form-content .ad .el-button--warning').forEach(el=>{
          el.style.height = this.contents.btnAdAllHeight
          el.style.color = this.contents.btnAdAllWarnFontColor
          el.style.fontSize = this.contents.btnAdAllFontSize
          el.style.borderWidth = this.contents.btnAdAllBorderWidth
          el.style.borderStyle = this.contents.btnAdAllBorderStyle
          el.style.borderColor = this.contents.btnAdAllBorderColor
          el.style.borderRadius = this.contents.btnAdAllBorderRadius
          el.style.backgroundColor = this.contents.btnAdAllWarnBgColor
        })
      })
    },
    // 表格
    rowStyle({ row, rowIndex}) {
      if (rowIndex % 2 == 1) {
        if(this.contents.tableStripe) {
          return {color:this.contents.tableStripeFontColor}
        }
      } else {
        return ''
      }
    },
    cellStyle({ row, rowIndex}){
      if (rowIndex % 2 == 1) {
        if(this.contents.tableStripe) {
          return {backgroundColor:this.contents.tableStripeBgColor}
        }
      } else {
        return ''
      }
    },
    headerRowStyle({ row, rowIndex}){
      return {color: this.contents.tableHeaderFontColor}
    },
    headerCellStyle({ row, rowIndex}){
      return {backgroundColor: this.contents.tableHeaderBgColor}
    },
    // 表格按钮
    contentTableBtnStyleChange(){
      // this.$nextTick(()=>{
      //   setTimeout(()=>{
      //     document.querySelectorAll('.table-content .tables .el-table__body .el-button--success').forEach(el=>{
      //       el.style.height = this.contents.tableBtnHeight
      //       el.style.color = this.contents.tableBtnDetailFontColor
      //       el.style.fontSize = this.contents.tableBtnFontSize
      //       el.style.borderWidth = this.contents.tableBtnBorderWidth
      //       el.style.borderStyle = this.contents.tableBtnBorderStyle
      //       el.style.borderColor = this.contents.tableBtnBorderColor
      //       el.style.borderRadius = this.contents.tableBtnBorderRadius
      //       el.style.backgroundColor = this.contents.tableBtnDetailBgColor
      //     })
      //     document.querySelectorAll('.table-content .tables .el-table__body .el-button--primary').forEach(el=>{
      //       el.style.height = this.contents.tableBtnHeight
      //       el.style.color = this.contents.tableBtnEditFontColor
      //       el.style.fontSize = this.contents.tableBtnFontSize
      //       el.style.borderWidth = this.contents.tableBtnBorderWidth
      //       el.style.borderStyle = this.contents.tableBtnBorderStyle
      //       el.style.borderColor = this.contents.tableBtnBorderColor
      //       el.style.borderRadius = this.contents.tableBtnBorderRadius
      //       el.style.backgroundColor = this.contents.tableBtnEditBgColor
      //     })
      //     document.querySelectorAll('.table-content .tables .el-table__body .el-button--danger').forEach(el=>{
      //       el.style.height = this.contents.tableBtnHeight
      //       el.style.color = this.contents.tableBtnDelFontColor
      //       el.style.fontSize = this.contents.tableBtnFontSize
      //       el.style.borderWidth = this.contents.tableBtnBorderWidth
      //       el.style.borderStyle = this.contents.tableBtnBorderStyle
      //       el.style.borderColor = this.contents.tableBtnBorderColor
      //       el.style.borderRadius = this.contents.tableBtnBorderRadius
      //       el.style.backgroundColor = this.contents.tableBtnDelBgColor
      //     })

      //   }, 50)
      // })
    },
    // 分页
    contentPageStyleChange(){
      let arr = []

      if(this.contents.pageTotal) arr.push('total')
      if(this.contents.pageSizes) arr.push('sizes')
      if(this.contents.pagePrevNext){
        arr.push('prev')
        if(this.contents.pagePager) arr.push('pager')
        arr.push('next')
      }
      if(this.contents.pageJumper) arr.push('jumper')
      this.layouts = arr.join()
      this.contents.pageEachNum = 10
    },

            kaoshengchengjiCrossAddOrUpdateHandler(row,type){
      this.showFlag = false;
      this.addOrUpdateFlag = false;
      this.kaoshengchengjiCrossAddOrUpdateFlag = true;
      this.$storage.set('crossObj',row);
      this.$storage.set('crossTable','baomingxinxi');
      this.$nextTick(() => {
        this.$refs.kaoshengchengjiCrossaddOrUpdate.init(row.id,type);
      });
    },
                payHandler(row){
      this.$storage.set('paytable','baomingxinxi');
      this.$storage.set('payObject',row);
      this.$router.push('pay');
    },
            chartDialog() {
      this.chartVisiable = !this.chartVisiable;
      this.$nextTick(()=>{
                                                                                                                                                                                                                                                 var xingbieChart = this.$echarts.init(document.getElementById("xingbieChart"),'macarons');
        this.$http({
            url: "group/baomingxinxi/xingbie",
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for(let i=0;i<res.length;i++){
                xAxis.push(res[i].xingbie);
                yAxis.push(res[i].total);
                pArray.push({
                value: res[i].total,
                name: res[i].xingbie
                })
                var option = {};
                                option = {
                    title: {
                        text: '报名信息',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                                // 使用刚指定的配置项和数据显示图表。
                xingbieChart.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    xingbieChart.resize();
                };
            }
            }
        });
                                                                                                                                                                                                                                                                                                           // xcolumn ycolumn  
              })
    },
        init () {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      },
    search() {
      this.pageIndex = 1;
      this.getDataList();
    },
    // 获取数据列表
    getDataList() {
      this.dataListLoading = true;
      let params = {
        page: this.pageIndex,
        limit: this.pageSize,
        sort: 'id',
      }
                                          if(this.searchForm.kaoshimingcheng!='' && this.searchForm.kaoshimingcheng!=undefined){
            params['kaoshimingcheng'] = '%' + this.searchForm.kaoshimingcheng + '%'
          }
                                                                                  if(this.searchForm.kaoshenghao!='' && this.searchForm.kaoshenghao!=undefined){
            params['kaoshenghao'] = '%' + this.searchForm.kaoshenghao + '%'
          }
                                                                                                        if(this.searchForm.zhuanyemingcheng!='' && this.searchForm.zhuanyemingcheng!=undefined){
            params['zhuanyemingcheng'] = '%' + this.searchForm.zhuanyemingcheng + '%'
          }
                                                            if(this.searchForm.kaoshengzhanghao!='' && this.searchForm.kaoshengzhanghao!=undefined){
            params['kaoshengzhanghao'] = '%' + this.searchForm.kaoshengzhanghao + '%'
          }
                                                            if(this.searchForm.kaoshengxingming!='' && this.searchForm.kaoshengxingming!=undefined){
            params['kaoshengxingming'] = '%' + this.searchForm.kaoshengxingming + '%'
          }
                                                            if(this.searchForm.xingbie!='' && this.searchForm.xingbie!=undefined){
            params['xingbie'] = '%' + this.searchForm.xingbie + '%'
          }
                                                            if(this.searchForm.zhuanye!='' && this.searchForm.zhuanye!=undefined){
            params['zhuanye'] = '%' + this.searchForm.zhuanye + '%'
          }
                                                            if(this.searchForm.shengfen!='' && this.searchForm.shengfen!=undefined){
            params['shengfen'] = '%' + this.searchForm.shengfen + '%'
          }
                                                            if(this.searchForm.xuexiao!='' && this.searchForm.xuexiao!=undefined){
            params['xuexiao'] = '%' + this.searchForm.xuexiao + '%'
          }
                                                                                                                                                                                                              this.$http({
        url: "baomingxinxi/page",
        method: "get",
        params: params
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.dataList = data.data.list;
          this.totalPage = data.data.total;
        } else {
          this.dataList = [];
          this.totalPage = 0;
        }
        this.dataListLoading = false;
      });
    },
    // 每页数
    sizeChangeHandle(val) {
      this.pageSize = val;
      this.pageIndex = 1;
      this.getDataList();
    },
    // 当前页
    currentChangeHandle(val) {
      this.pageIndex = val;
      this.getDataList();
    },
    // 多选
    selectionChangeHandler(val) {
      this.dataListSelections = val;
    },
    // 添加/修改
    addOrUpdateHandler(id,type) {
      this.showFlag = false;
      this.addOrUpdateFlag = true;
      this.crossAddOrUpdateFlag = false;
      if(type!='info'){
        type = 'else';
      }
      this.$nextTick(() => {
        this.$refs.addOrUpdate.init(id,type);
      });
    },
    // 查看评论
        // 审核窗口
    shDialog(row){
      this.sfshVisiable = !this.sfshVisiable;
      if(row){
        this.shForm = {
                    kaoshimingcheng: row.kaoshimingcheng,
                    kaoshishijian: row.kaoshishijian,
                    kaoshenghao: row.kaoshenghao,
                    baokaofeiyong: row.baokaofeiyong,
                    kaoshidizhi: row.kaoshidizhi,
                    zhuanyemingcheng: row.zhuanyemingcheng,
                    kaoshengzhanghao: row.kaoshengzhanghao,
                    kaoshengxingming: row.kaoshengxingming,
                    xingbie: row.xingbie,
                    zhuanye: row.zhuanye,
                    shengfen: row.shengfen,
                    xuexiao: row.xuexiao,
                    lianxidianhua: row.lianxidianhua,
                    nianling: row.nianling,
                    touxiang: row.touxiang,
                    baomingshijian: row.baomingshijian,
                    beizhu: row.beizhu,
                    sfsh: row.sfsh,
                    shhf: row.shhf,
                    ispay: row.ispay,
                    id: row.id
        }
      }
    },
    // 审核
    shHandler(){
      this.$confirm(`确定操作?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(() => {
        this.$http({
          url: "baomingxinxi/update",
          method: "post",
          data: this.shForm
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: "操作成功",
              type: "success",
              duration: 1500,
              onClose: () => {
                this.getDataList();
                this.shDialog()
              }
            });
          } else {
            this.$message.error(data.msg);
          }
        });
      });
    },
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 删除
    deleteHandler(id) {
      var ids = id
        ? [Number(id)]
        : this.dataListSelections.map(item => {
            return Number(item.id);
          });
      this.$confirm(`确定进行[${id ? "删除" : "批量删除"}]操作?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(() => {
        this.$http({
          url: "baomingxinxi/delete",
          method: "post",
          data: ids
        }).then(({ data }) => {
          if (data && data.code === 0) {
            this.$message({
              message: "操作成功",
              type: "success",
              duration: 1500,
              onClose: () => {
                this.search();
              }
            });
          } else {
            this.$message.error(data.msg);
          }
        });
      });
    },
    async printJson() {
      //通过getdata调用后台接口获取数据封装到res
      this.list = this.dataList;
      let data = []
      for (let i=0; i < this.list.length; i++) {
          data.push({
          kaoshimingcheng: this.list[i].kaoshimingcheng,
          kaoshishijian: this.list[i].kaoshishijian,
          kaoshenghao: this.list[i].kaoshenghao,
          baokaofeiyong: this.list[i].baokaofeiyong,
          kaoshidizhi: this.list[i].kaoshidizhi,
          zhuanyemingcheng: this.list[i].zhuanyemingcheng,
          kaoshengzhanghao: this.list[i].kaoshengzhanghao,
          kaoshengxingming: this.list[i].kaoshengxingming,
          xingbie: this.list[i].xingbie,
          zhuanye: this.list[i].zhuanye,
          shengfen: this.list[i].shengfen,
          xuexiao: this.list[i].xuexiao,
          lianxidianhua: this.list[i].lianxidianhua,
          nianling: this.list[i].nianling,
          baomingshijian: this.list[i].baomingshijian,
          sfsh: this.list[i].sfsh,
          ispay: this.list[i].ispay,
        })
      }
      printJS({
        printable: data,
        properties: [
	  {
		field: 'kaoshimingcheng',
		displayName: '考试名称',
		columnSize: 1
	  },
	  {
		field: 'kaoshishijian',
		displayName: '考试时间',
		columnSize: 1
	  },
	  {
		field: 'kaoshenghao',
		displayName: '考生号',
		columnSize: 1
	  },
	  {
		field: 'baokaofeiyong',
		displayName: '报考费用',
		columnSize: 1
	  },
	  {
		field: 'kaoshidizhi',
		displayName: '考试地址',
		columnSize: 1
	  },
	  {
		field: 'zhuanyemingcheng',
		displayName: '专业名称',
		columnSize: 1
	  },
	  {
		field: 'kaoshengzhanghao',
		displayName: '考生账号',
		columnSize: 1
	  },
	  {
		field: 'kaoshengxingming',
		displayName: '考生姓名',
		columnSize: 1
	  },
	  {
		field: 'xingbie',
		displayName: '性别',
		columnSize: 1
	  },
	  {
		field: 'zhuanye',
		displayName: '专业',
		columnSize: 1
	  },
	  {
		field: 'shengfen',
		displayName: '省份',
		columnSize: 1
	  },
	  {
		field: 'xuexiao',
		displayName: '学校',
		columnSize: 1
	  },
	  {
		field: 'lianxidianhua',
		displayName: '联系电话',
		columnSize: 1
	  },
	  {
		field: 'nianling',
		displayName: '年龄',
		columnSize: 1
	  },
	  {
		field: 'baomingshijian',
		displayName: '报名时间',
		columnSize: 1
	  },
	  {
		field: 'sfsh',
		displayName: '是否审核',
		columnSize: 1
	  },
	  {
		field: 'ispay',
		displayName: '是否支付',
		columnSize: 1
	  },
        ],
        type: 'json',
        header: '报名信息',
        // 样式设置
        gridStyle: 'border: 2px solid #3971A5;',
        gridHeaderStyle: 'color: red;  border: 2px solid #3971A5;'
      })
    },
  }

};
</script>
<style lang="scss" scoped>
//导出excel
  .export-excel-wrapper{
    display: inline-block;
  }
  .slt {
    margin: 0 !important;
    display: flex;
  }

  .ad {
    margin: 0 !important;
    display: flex;
  }

  .pages {
    & /deep/ el-pagination__sizes{
      & /deep/ el-input__inner {
        height: 22px;
        line-height: 22px;
      }
    }
  }
  

  .el-button+.el-button {
    margin:0;
  } 

  .tables {
	& /deep/ .el-button--success {
		height: 40px;
		color: #333;
		font-size: 14px;
		border-width: 1px;
		border-style: solid;
		border-color: #DCDFE6;
		border-radius: 4px;
		background-color: rgba(117, 113, 249, 1);
	}
	
	& /deep/ .el-button--primary {
		height: 40px;
		color: #333;
		font-size: 14px;
		border-width: 1px;
		border-style: solid;
		border-color: #DCDFE6;
		border-radius: 4px;
		background-color: rgba(102, 204, 255, 1);
	}
	
	& /deep/ .el-button--danger {
		height: 40px;
		color: #333;
		font-size: 14px;
		border-width: 1px;
		border-style: solid;
		border-color: #DCDFE6;
		border-radius: 4px;
		background-color: rgba(204, 255, 102, 1);
	}

    & /deep/ .el-button {
      margin: 4px;
    }
  }

</style>
