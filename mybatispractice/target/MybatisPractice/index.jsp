<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<body>
	<h2>find the person by id</h2>
</body>
<form action="<%=basePath%>indexServlet">
	<div class="control-group">
		<label class="control-label">id：</label>
		<div class="controls">
			<input name="id" placeholder="id" type="text">
		</div>
	</div>


	<div class="control-group">
		<label class="control-label"></label>
		<div class="controls">
			<button type="submit" class="sui-btn btn-primary">提交</button>

		</div>
	</div>
</form>
</html>
<script type="text/javascript">
	function getQuery() {
		$("#id").val();
	}
</script>
