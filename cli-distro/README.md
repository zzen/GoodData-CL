This is GoodData command-line utility. The utility contains data modeling, transformation and loading functionality that work on top of the [GoodData REST APIs](http://developer.gooddata.com/api/).

## Installation

1. [download](http://github.com/gooddata/GoodData-CL/downloads) and unpack the binary distribution:

2. [Make sure](http://confluence.atlassian.com/display/DOC/Setting+the+JAVA_HOME+Variable+in+Windows) that your JAVA_HOME environment variable points to your Java installation directory.  
   *Please note that only the Java versions 1.5 and 1.6 are currently supported.*

3. run the `gdi` script without arguments to get help from the unpacked distribution:

    <div class="platforms">
    <pre class="win"><code>C:&gt; bin\gdi.bat
        usage: GdcDI
         -h,--host &lt;arg&gt;       GoodData host
         -p,--password &lt;arg&gt;   GoodData password
         -u,--username &lt;arg&gt;   GoodData username
        [...]</code></pre>

    <pre class="unix"><code>$ ./bin/gdi.sh
        usage: GdcDI
         -h,--host &lt;arg&gt;       GoodData host
         -p,--password &lt;arg&gt;   GoodData password
         -u,--username &lt;arg&gt;   GoodData username
        [...]</code></pre>
    </div>

# Next Steps

Please see the [GoodData CL examples and documentation](http://developer.gooddata.com/gooddata-cl/).