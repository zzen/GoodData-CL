# Executing All Reports in a GoodData Project

This example enumerates and executes all reports in a selected project. The execution creates caches in the project.
Once the caches are created the subsequent execution of the reports is significantly faster. You have to re-execute this
after every data load.

Please make sure that the project ID in the `report_exec.txt` script references the project where you want to perform
the reports execution.

You can find out your project ID by logging to GoodData, visiting
`https://secure.gooddata.com/gdc/md`, and clicking on the project link. The long hash on the top of the page is your
project ID.

Run `gdi.sh` with the `report_exec.txt` script as follows:

<div class="platforms">
    <pre class="win"><code>c:&gt; bin\gdi.bat -u &lt;username&gt; -p &lt;password&gt; examples\report_exec\report_exec.txt</code></pre>
    <pre class="unix"><code>$ ./bin/gdi.sh -u &lt;username&gt; -p &lt;password&gt; examples/report_exec/report_exec.txt</code></pre>
</div>
