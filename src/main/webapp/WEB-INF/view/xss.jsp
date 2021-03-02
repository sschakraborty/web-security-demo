<html>
    <head>
        <title>XSS Demo</title>
    </head>
    <body style="font-size: 14pt; padding: 15px;">
    <pre>
        Cross-site scripting (XSS) is a type of security vulnerability typically found in web applications.
        XSS attacks enable attackers to inject client-side scripts into web pages viewed by other users.
        A cross-site scripting vulnerability may be used by attackers to bypass access controls such as the same-origin policy.
        Cross-site scripting carried out on websites accounted for roughly 84% of all security vulnerabilities documented by Symantec up until 2007.
        XSS effects vary in range from petty nuisance to significant security risk, depending on the sensitivity of the
        data handled by the vulnerable site and the nature of any security mitigation implemented by the site's owner network.

        XSS are generally of two types - Stored and Reflected. We are going to show the demos for both the types.

        Reflected XSS occurs when the XSS payload can be injected through parameters but is not stored on the server.
        This means the adversary can construct an external link to the vulnerable site with the XSS payload as parameter and make the victim
        to click it. When the victim clicks on the link, the XSS payload is injected and executed in the execution context of the vulnerable
        site.

        Take an example of the next form. This form has a text-box and the site to which the form is submitted, simply
        echoes back the content as HTML as a response. Which means, I we enter "Hello World!" in the text-box and submit the form,
        we should see a nice Hello World! printed on the screen.

        <form method="GET" action="/reflected_xss_api">
            <label>Enter text to echo</label>
            <input type="text" maxlength="250" name="script" value="Hello World!" />
            <button type="submit">Submit</button>
        </form>

        If we submit the Hello World! text (or for that matter anything else) we see that the text is echoed back into the response.
        However, now type in &lt;script&gt;alert(&quot;Hello World!&quot;)&lt;/script&gt; and try submitting. You should see an alert box popping up as the echoed script
        in the response is executed by the browser and thus is a reflected XSS vulnerability.
     </pre>
    </body>
</html>