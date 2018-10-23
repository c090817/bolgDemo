<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!--左侧菜单栏-->
<section id="content_wrapper">
    <div class="panel panel-default">
        <div class="panel-body">
            <form id="activeTab" name="activeTab">
                <input type="hidden" class="form-control a-v" name="activeId" value="${active.id}">
                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动名称</span>
                    <input type="text" class="form-control a-v" name="activeName" value="${active.activeName}" readonly>
                </div>
                <br>
                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动状态</span>
                    <select class="form-control a-v" id="status" name="status">
                        <c:if test="${active.status == 1}">
                            <option value="1" selected>未审核</option>
                            <option value="2">已审核</option>
                            <option value="3">结束</option>
                            <option value="4">人为取消</option>
                        </c:if>
                        <c:if test="${active.activeType == 2}">
                            <option value="1">未审核</option>
                            <option value="2" selected>已审核</option>
                            <option value="3">结束</option>
                            <option value="4">人为取消</option>
                        </c:if>
                        <c:if test="${active.activeType == 3}">
                            <option value="1">未审核</option>
                            <option value="2">已审核</option>
                            <option value="3" selected>结束</option>
                            <option value="4">人为取消</option>
                        </c:if>
                        <c:if test="${active.activeType == 4}">
                            <option value="1">未审核</option>
                            <option value="2">已审核</option>
                            <option value="3">结束</option>
                            <option value="4" selected>人为取消</option>
                        </c:if>
                    </select>
                </div>
                <br>
                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动描述</span>
                    <input type="text" class="form-control a-v" name="description" value="${active.description}"
                           readonly>
                </div>
                <br>

                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动地址</span>
                    <input type="text" class="form-control a-v" name="linkUrl" value="${active.linkUrl}" readonly>
                </div>
                <br>

                <div class="input-group col-md-6">
                    <span class="input-group-addon">图片地址</span>
                    <input type="text" class="form-control a-v" name="imageurl" value="${active.imageurl}" readonly>
                </div>
                <br>
               <div class="input-group col-md-6">
                    <span class="input-group-addon">活动时间</span>
                   <input type="text" value="${active.expiringFrom}-${active.expiringTo}" class="form-control pull-right" data-date-format="YYYY-MM-DD HH:mm:ss" name="dateRange" id="daterangepicker1">
                </div>
                <br>
                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动类型</span>
                    <select class="form-control a-v" id="activeType" name="activeType">
                        <c:if test="${active.activeType == 1}">
                            <option value="1" selected>注册</option>
                            <option value="2">微信认证</option>
                            <option value="3">认证身份证</option>
                            <option value="4">邀请好友</option>
                            <option value="5">评价</option>
                        </c:if>
                        <c:if test="${active.activeType == 2}">
                            <option value="1">注册</option>
                            <option value="2" selected>微信认证</option>
                            <option value="3">认证身份证</option>
                            <option value="4">邀请好友</option>
                            <option value="5">评价</option>
                        </c:if>
                        <c:if test="${active.activeType == 3}">
                            <option value="1">注册</option>
                            <option value="2">微信认证</option>
                            <option value="3" selected>认证身份证</option>
                            <option value="4">邀请好友</option>
                            <option value="5">评价</option>
                        </c:if>
                        <c:if test="${active.activeType == 4}">
                            <option value="1" selected>注册</option>
                            <option value="2">微信认证</option>
                            <option value="3">认证身份证</option>
                            <option value="4" selected>邀请好友</option>
                            <option value="5">评价</option>
                        </c:if>
                        <c:if test="${active.activeType == 5}">
                            <option value="1">注册</option>
                            <option value="2">微信认证</option>
                            <option value="3">认证身份证</option>
                            <option value="4">邀请好友</option>
                            <option value="5" selected>评价</option>
                        </c:if>
                    </select>
                </div>
                <br>
                <div class="input-group col-md-6">
                    <button type="button" class="btn btn-primary editActive">编辑</button>
                    <button type="button" class="btn btn-primary saveActive" style="display: none">保存</button>
                    <button type="button" class="btn btn-primary cancelActive" style="display: none">取消</button>
                    <br>
                </div>
            </form>
        </div>
    </div>
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">活动明细列表</h3>
        </div>
        <div class="panel-body">
            <div class="list-group">
                <c:forEach items="${activeDetailList}" var="activeDetail">
                    <li class="list-group-item" style="cursor:pointer;" id="activeDetail-${activeDetail.id}"
                        title="${activeDetail.id}">活动优惠类型:
                        <c:if test="${activeDetail.activeType == 1}">
                    <span class="acTypeId" title="1">赠券,券类型:
                    <c:if test="${activeDetail.couponType == 1}">
                        <span class="cpt" title="1">新用户券</span>
                    </c:if>
                    <c:if test="${activeDetail.couponType == 2}">
                        <span class="cpt" title="2">折扣券</span>
                    </c:if>
                    <c:if test="${activeDetail.couponType == 3}">
                        <span class="cpt" title="3">随机折扣券</span>
                    </c:if>
                    <c:if test="${activeDetail.couponType == 4}">
                        <span class="cpt" title="4">优惠券</span>
                    </c:if>
                    <c:if test="${activeDetail.couponType == 5}">
                        <span class="cpt" title="5">礼品卡</span>
                    </c:if>
                    </span>优惠券ID：<span id="cptId" >${activeDetail.couponTypeId}</span>
                        </c:if>
                        <c:if test="${activeDetail.activeType == 2}">
                            <span class="acTypeId" title="2">赠积分</span>
                        </c:if>
                        ,触发条件:
                        <c:if test="${activeDetail.orderStatus == 60}">
                            <span class="ods" title="60">任务单完成</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 1}">
                            <span class="ods" title="1">新任务</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 10}">
                            <span class="ods" title="10">抢单中</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 30}">
                            <span class="ods" title="30">确认抢单人</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 40}">
                            <span class="ods" title="40">任务开始</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 50}">
                            <span class="ods" title="50">发起交付</span>
                        </c:if>
                        <c:if test="${activeDetail.orderStatus == 200}">
                            <span class="ods" title="200">收款</span>
                        </c:if>
                    </li>
                </c:forEach>
            </div>
        </div>
    </div>
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">活动规则&nbsp;&nbsp;&nbsp;&nbsp;
                <button class="btn btn-success editActiveRuleByeditOld">修改</button>
            </h3>
        </div>
        <div class="panel-body">
            <div class="list-group oldRuleBody">
                <c:forEach items="${activeRuleList}" var="activeRule">
                    <li class="list-group-item" style="cursor:pointer;" id="activeRule-${activeRule.id}">规则分类类型:
                        <c:if test="${activeRule.categoryType == 2}">
                    <span class="acTypeId">大类,大服务分类为:${activeRule.categoryName},服务分类规则为:
                    <c:if test="${activeRule.isExclude == 1}">
                        包含
                    </c:if>
                    <c:if test="${activeRule.isExclude == 2}">
                        排除
                    </c:if>
                    <c:if test="${activeRule.isExclude == 3}">
                        全部
                    </c:if>
                    </span>
                        </c:if>
                        <c:if test="${activeRule.categoryType == 1}"><span>全场,由于服务于所有分类,所以没有其他具体信息了~~</span></c:if>
                    </li>
                </c:forEach>
            </div>
        </div>
    </div>
    <div class="panel panel-default updateActiveRuleTab" style="display:none">
        <div class="panel-heading">设置活动规则</div>
        <div class="panel-body">
            <div class="input-group">
                <span class="input-group-addon">活动分类类型</span>
                <select name="categoryType" id="categoryType" class="col-md-6">
                    <option value="0">--请选择--</option>
                    <option value="1">全场</option>
                    <option value="2">大类</option>
                </select>
            </div>
            <br>
            <div class="input-group serviceCatogaryRule">
                <span class="input-group-addon">服务分类规则</span>&nbsp;&nbsp;
                <div class="radio-group col-md-6" data-toggle="radio" id="isExclude">
                    <input type="radio" name="isExclude" id="inlineRadio1" value="1"> 包含 &nbsp;&nbsp;
                    <input type="radio" name="isExclude" id="inlineRadio2" value="2"> 排除 &nbsp;&nbsp;
                    <input type="radio" name="isExclude" id="inlineRadio3" value="3" checked> 全部 &nbsp;&nbsp;
                </div>
            </div>
            <br>
            <div class="input-group maxCatogory" style="display: none">
                <span class="input-group-addon">服务分类列表</span>&nbsp;&nbsp;
                <div class="checkbox-group col-md-10" data-toggle="checkbox" id="rule">
                    <c:forEach items="${maxCategory}" var="category">
                        <input type="checkbox" name="checkbox" id="category-${category.categoryId}"
                               value="${category.categoryId}"
                               title="${category.categoryName}"> ${category.categoryName} &nbsp;&nbsp;
                    </c:forEach>
                </div>
            </div>
            <br>
            <div class="input-group maxCatSelected" style="display: none">
                <span class="input-group-addon">服务分类列表</span>&nbsp;&nbsp;
                <div class="radio-group col-md-10" data-toggle="radio" id="rule2">
                    <c:forEach items="${maxCategory}" var="category">
                        <input type="radio" name="maxCatRadio" id="maxCatSelected-category-${category.categoryId}"
                               value="${category.categoryId}"
                               title="${category.categoryName}"> ${category.categoryName} &nbsp;&nbsp;
                    </c:forEach>
                </div>
            </div>
            <br>
            <div class="input-group serviceCatogaryRule2" style="display: none">
                <span class="input-group-addon">服务分类规则</span>&nbsp;&nbsp;
                <div class="radio-group col-md-6" data-toggle="radio" id="isExclude2">
                    <input type="radio" name="isExclude2" id="inlineRadio11" value="1" checked> 包含 &nbsp;&nbsp;
                    <input type="radio" name="isExclude2" id="inlineRadio22" value="2"> 排除 &nbsp;&nbsp;
                    <input type="radio" name="isExclude2" id="inlineRadio33" value="3"> 全部 &nbsp;&nbsp;
                </div>
            </div>
            <br>
            <div class="input-group minCatogory" style="display: none">
                <span class="input-group-addon">小分类列表</span>&nbsp;&nbsp;
                <div class="checkbox-group col-md-10" data-toggle="checkbox" id="rule">
                    <table class="table table-bordered">
                        <tbody id="minCatList">
                        </tbody>
                    </table>
                </div>
            </div>
            <br>
            <div class="input-group">
                <button type="button" class="btn btn-primary createActiveRuleDetailsBtn">保存分类规则</button>
                <br>
            </div>
        </div>
    </div>
    <div class="panel panel-info oneActiveDetail" style="display: none;">
        <div class="panel-heading">
            <h3 class="panel-title">活动详情明细单</h3>
        </div>
        <div class="panel-body">
            <form id="editActiveDetailTab">
                <input type="hidden" name="id" id="detailId" value="">
                <input type="hidden" name="activeId" value="${active.id}">
                <div class="input-group col-md-6">
                    <span class="input-group-addon">活动优惠类型</span>
                    <select class="a-v" id="eadTab-activeType" name="activeType">
                    </select>
                </div>
                <br>
                <div class="input-group col-md-6">
                    <span class="input-group-addon">优惠券类型</span>
                    <select class="a-v" id="eadTab-couponType" name="couponType">
                    </select>
                </div>
                <br>

                <div class="input-group col-md-6">
                    <span class="input-group-addon">优惠券名称</span>
                    <select class="a-v" id="eadTab-couponTypeId" name="couponTypeId">
                    </select>
                </div>
                <br>

                <div class="input-group col-md-6">
                    <span class="input-group-addon">触发条件</span>
                    <select class="a-v" id="eadTab-orderStatus" name="orderStatus">
                    </select>
                </div>
                <br>

                <div class="input-group col-md-6">
                    <button type="button" class="btn btn-primary tabSaveActiveDetail">保存</button>
                    <button type="button" class="btn btn-primary tabCancelActiveDetail">取消</button>
                    <br>
                </div>
            </form>
        </div>
    </div>
</section>
<script type="text/javascript">
    $(function(){
        // daterange plugin options
        var rangeOptions = {
            ranges: {
                'Today': [moment(), moment()],
                'Yesterday': [moment().subtract('days', 1), moment().subtract('days', 1)],
                'Last 7 Days': [moment().subtract('days', 6), moment()],
                'Last 30 Days': [moment().subtract('days', 29), moment()],
                'This Month': [moment().startOf('month'), moment().endOf('month')],
                'Last Month': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
            },
            startDate: moment().subtract('days', 29),
            endDate: moment()
        }
        // Init daterange plugin
        $('#daterangepicker1').daterangepicker({
            format:'YYYY-MM-DD HH:mm:ss',
            language:'CN',
            weekStart: 1,
            todayBtn:  1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1,
            setStartDate: '2015-12-12 00:00:00'
        });
    });
</script>
<!-- End: Content -->
