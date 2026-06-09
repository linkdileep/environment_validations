using Microsoft.Playwright;

using var playwright = await Playwright.CreateAsync();

await using var browser = await playwright.Chromium.LaunchAsync(
    new BrowserTypeLaunchOptions
    {
        Headless = true
    });

Console.WriteLine("Playwright Browser Launch Successful");

await browser.CloseAsync();