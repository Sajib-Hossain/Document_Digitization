# Generated by Django 3.2 on 2021-05-16 12:07

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('admin_page', '0008_alter_doc_files_id'),
    ]

    operations = [
        migrations.CreateModel(
            name='Notification',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('message', models.CharField(max_length=100)),
                ('time', models.DateTimeField(auto_now_add=True)),
                ('user', models.ManyToManyField(blank=True, null=True, to='admin_page.Plan_User')),
            ],
        ),
    ]